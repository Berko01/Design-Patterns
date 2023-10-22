package collection.creditcard;

import java.math.BigDecimal;

import debt.PaymentInformationDto;

public class CreditCardService {
    private CreditCardControlService creditCardControlService;


    public CreditCardService() {
        creditCardControlService = new CreditCardControlService();
    }

    public boolean tryChargingFromCreditCard(PaymentInformationDto paymentInformationDto, BigDecimal amountToBePaid){

        boolean creditCardValid = creditCardControlService.isCreditCardValid(paymentInformationDto);

        if(!creditCardValid){
            return false;
        }

        boolean thereIsEnoughLimit = isThereEnoughLimit(paymentInformationDto, amountToBePaid);

        if(!thereIsEnoughLimit){
            return false;
        }

        System.out.println("Kredi kartindan " + amountToBePaid + "TL tahsil edilmiştir.");

        return true;

    }

    private boolean isThereEnoughLimit(PaymentInformationDto paymentInformationDto, BigDecimal amountToBePaid) {

        BigDecimal limit = getCreditCardLimit(paymentInformationDto);

        boolean isThereEnoughLimit = limit.compareTo(amountToBePaid) > 0;
        
        if(!isThereEnoughLimit){
            System.out.println("Kartta yeterli limit bulunmaktadir.");
        }
        return isThereEnoughLimit;
    }

    private BigDecimal getCreditCardLimit(PaymentInformationDto paymentInformationDto) {

        BigDecimal limit = BigDecimal.ZERO;

        String nameOnTheCard = paymentInformationDto.getNameOnTheCard();

        if(nameOnTheCard.contains("Bahadir")){
            limit = new BigDecimal(500);
        }else if(nameOnTheCard.contains("Ayşe")){
            limit = new BigDecimal(1000);
        }else if(nameOnTheCard.contains("Yusuf")){
            limit = BigDecimal.TEN;
        }
        return limit;
    }
    
    
}

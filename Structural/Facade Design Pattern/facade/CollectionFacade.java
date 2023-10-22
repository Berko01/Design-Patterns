package facade;

import java.math.BigDecimal;

import collection.CollectionControlService;
import collection.creditcard.CreditCardControlService;
import collection.creditcard.CreditCardService;
import debt.Debt;
import debt.PaymentInformationDto;
import late.LateFeeCalculationService;

public class CollectionFacade {

    private LateFeeCalculationService lateFeeCalculationService;
    private CollectionControlService collectionControlService;
    private CreditCardService creditCardService;


    public CollectionFacade(){

        lateFeeCalculationService= new LateFeeCalculationService();
        collectionControlService = new CollectionControlService();
        creditCardService = new CreditCardService();

    }

    public boolean collect(Debt debt, PaymentInformationDto paymentInformationDto){
        boolean suitableForCollection = collectionControlService.isSuitableForCollection(debt);

        if(!suitableForCollection){
            return false;
        }

        BigDecimal debtAmount = debt.getDebtAmount();

        BigDecimal lateFee = lateFeeCalculationService.calculateLateFee(debt.getDebtAmount(), debt.getExpiryDate());

        BigDecimal amountToBePayed = debtAmount.add(lateFee);

        System.out.println("Bilgi: Kredi kartindan " + amountToBePayed + "TL tahsilat deneniyor.");

        boolean isSuccess = creditCardService.tryChargingFromCreditCard(paymentInformationDto, amountToBePayed);

        return isSuccess;


        
    }
}

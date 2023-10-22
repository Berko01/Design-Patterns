package collection.creditcard;

import java.util.Date;

import date.DateUtil;
import debt.PaymentInformationDto;

public class CreditCardControlService {

    public boolean isCreditCardValid(PaymentInformationDto paymentInformationDto) {
        Long expiryMonth = paymentInformationDto.getExpiryMonth();
        Long expiryYear = paymentInformationDto.getExpiryYear();

        Date currentDate = DateUtil.getCurrentDate();

        Long yearOfDate = DateUtil.yearOfDate(currentDate);
        Long monthOfDate = DateUtil.monthOfDate(currentDate);

        boolean isCreditCardValid = false;

        if (yearOfDate.compareTo(expiryYear) > 0) {
            isCreditCardValid = true;
        }
        else if(yearOfDate.compareTo(expiryYear) == 0){
            if(monthOfDate.compareTo(expiryMonth) >= 0)
                isCreditCardValid = true;
        }

        if(!isCreditCardValid){
            System.out.println("Gecersiz kredi karti bilgileri.");
        }

        return isCreditCardValid;

    }
}

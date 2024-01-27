package App;

import java.math.BigDecimal;

import java.util.Collection;
import java.util.Date;
import date.DateUtil;
import debt.Debt;
import debt.EnumDebtType;
import debt.PaymentInformationDto;
import facade.CollectionFacade;

public class App {

    public static void main(String[] args) {
        CollectionFacade collectionFacade = new CollectionFacade();

        Long id = 1L;
        BigDecimal debtAmount = new BigDecimal(10);
        EnumDebtType enumDebtType = EnumDebtType.Restructuring;
        Date expiryDate = DateUtil.createDate("01.08.2023");
        

        Debt debt = new Debt(id, enumDebtType, new BigDecimal(100),expiryDate);

        PaymentInformationDto paymentInformationDto = new PaymentInformationDto("Sadik Bahadir Memiş", 12345456, 01L,
                2023L, 123L);

        boolean isSuccess = collectionFacade.collect(debt, paymentInformationDto);

        if(isSuccess){
            System.out.println("Tahsilat yapildi.");
        }
        else{
            System.out.println("Tahsilat yapilamadi.");
        }
    }

}

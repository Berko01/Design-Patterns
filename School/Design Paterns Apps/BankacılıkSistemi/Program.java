import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        ArrayList<CreditRequestBase> creditOperations = new ArrayList<>();

        creditOperations.add(new CheckKbbScore());
        creditOperations.add(new CheckKreditCardPaymentTime());
        creditOperations.add(new CheckGurantorIsFine());
        creditOperations.add(new CustomerEarningsIsEnoughToPayCredit());
        creditOperations.add(new CheckCompanyCustomerWork());

        creditOperations.get(0).setNextOperation(creditOperations.get(1));
        creditOperations.get(1).setNextOperation(creditOperations.get(2));
        creditOperations.get(2).setNextOperation(creditOperations.get(3));
        creditOperations.get(3).setNextOperation(creditOperations.get(4));

        creditOperations.get(0).execute(new Customer());

        boolean creditConfirmed = creditOperations.get(creditOperations.size() - 1).isCreditConfirmed();

        if(creditConfirmed)
        {
            System.out.println("Kredi istegi onaylandi.");
        }
        else{
            System.out.println("Kredi istegi reddedildi.");
        }
    }
}

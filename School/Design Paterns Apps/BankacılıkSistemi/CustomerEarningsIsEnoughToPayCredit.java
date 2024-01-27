public class CustomerEarningsIsEnoughToPayCredit extends CreditRequestBase{

    @Override
    public void executeProcess(Customer customer) {
        if(isCreditConfirmed()){
            boolean isEnoughToPay = true;

            if(isEnoughToPay)
                setCreditConfirmed(true);
            else
                setCreditConfirmed(false);
        }
    }
    
}

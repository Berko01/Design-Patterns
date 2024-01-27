public class CheckGurantorIsFine extends CreditRequestBase {

    @Override
    public void executeProcess(Customer customer) {
        if(isCreditConfirmed()){
            boolean guarantorIsFine = true;

            if(guarantorIsFine)
                setCreditConfirmed(true);
            else
                setCreditConfirmed(false);
        }
    }
    
}

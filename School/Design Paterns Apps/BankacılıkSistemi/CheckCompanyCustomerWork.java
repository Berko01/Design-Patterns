public class CheckCompanyCustomerWork  extends CreditRequestBase{

    @Override
    public void executeProcess(Customer customer) {
        if(isCreditConfirmed()){
            boolean companyIsFine = true;

            if(companyIsFine)
                setCreditConfirmed(true);
            else
                setCreditConfirmed(false);
        }
    }
    
}

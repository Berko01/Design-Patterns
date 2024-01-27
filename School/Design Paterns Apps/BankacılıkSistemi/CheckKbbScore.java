public class CheckKbbScore extends CreditRequestBase {

    @Override
    public void executeProcess(Customer customer) {
        if(isCreditConfirmed()){
        int kbbScore = 1200;

        if(kbbScore > 1000)
        {
            setCreditConfirmed(true);
        }
        else{
            setCreditConfirmed(false);
        }
    }
}

}

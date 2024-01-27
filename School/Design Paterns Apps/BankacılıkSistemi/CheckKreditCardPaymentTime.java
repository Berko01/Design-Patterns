public class CheckKreditCardPaymentTime extends CreditRequestBase {

    @Override
    public void executeProcess(Customer customer) {
        int paymentDelayTime = 1;
        if(paymentDelayTime > 3){
            setCreditConfirmed(false);
        }
        else{
            setCreditConfirmed(true);
        }
    }
    
}

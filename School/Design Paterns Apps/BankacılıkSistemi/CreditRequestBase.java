public abstract class CreditRequestBase {

    //nesneler arası tasınmak istenen veri
    //Birden fazla da olabilirdi. Genelde oyle olur.
    private boolean creditConfirmed;
    private CreditRequestBase nextOperation;

    public CreditRequestBase getNextOperation() {
        return nextOperation;
    }

    public void setNextOperation(CreditRequestBase nextOperation) {
        this.nextOperation = nextOperation;
    }

    public void execute(Customer c) {
        executeProcess(c);

        if (this.nextOperation != null) {
            this.nextOperation.creditConfirmed = this.creditConfirmed;
            // her seferinde bir sonrakine aktarilir.
            this.nextOperation.execute(c);
            // bir sonraki calistirilir
        }

    }

    public abstract void executeProcess(Customer customer);

    public boolean isCreditConfirmed() {
        return creditConfirmed;
    }

    public void setCreditConfirmed(boolean creditConfirmed) {
        this.creditConfirmed = creditConfirmed;
    }

}
public abstract class SuplierCommand implements ICommand{
    
    protected RecevierSuplier receiverSuplier;

    public SuplierCommand(RecevierSuplier receiverSuplier) {
        this.receiverSuplier = receiverSuplier;
    }

    @Override
    public abstract void execute();
}

public class EnableSupplierCommand extends SuplierCommand{

    public EnableSupplierCommand(RecevierSuplier receiverSuplier) {
        super(receiverSuplier);
    }

    @Override
    public void execute() {
        receiverSuplier.enable();
    }
    
}

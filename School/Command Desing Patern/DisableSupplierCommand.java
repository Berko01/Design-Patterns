public class DisableSupplierCommand extends SuplierCommand {

    public DisableSupplierCommand(RecevierSuplier receiverSuplier) {
        super(receiverSuplier);
    }

    @Override
    public void execute() {
        receiverSuplier.disable();
    }
    
}

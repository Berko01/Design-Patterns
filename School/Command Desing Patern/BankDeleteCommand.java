public class BankDeleteCommand extends CommandBank {

    public BankDeleteCommand(ReceiverBank receiverBank) {
        super(receiverBank);
    }

    @Override
    public void execute() {
        receiverBank.delete();
    }
    
}

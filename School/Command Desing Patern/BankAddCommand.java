public class BankAddCommand extends CommandBank {

    public BankAddCommand(ReceiverBank receiverBank) {
        super(receiverBank);
    }

    @Override
    public void execute() {
        receiverBank.add();
    }
    
}

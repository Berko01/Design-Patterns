public abstract class CommandBank implements ICommand {

    protected ReceiverBank receiverBank;

    public CommandBank(ReceiverBank receiverBank) {
        this.receiverBank = receiverBank;
    }

    public abstract void execute();
    

}

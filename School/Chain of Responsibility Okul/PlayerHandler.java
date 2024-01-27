public abstract class PlayerHandler{

    protected PlayerHandler nextHandler;

    public abstract void play(String filePath);

    public void setNextHandler(PlayerHandler nextHandler) {
        this.nextHandler = nextHandler;
    }
}
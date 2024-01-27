public abstract class Handler {

    Handler nexHandler;

    public abstract Handler nextHandler();

    public abstract void handleRequest();

    public Handler getNexHandler() {
        return nexHandler;
    }

    public void setNexHandler(Handler nexHandler) {
        this.nexHandler = nexHandler;
    }
    
} 

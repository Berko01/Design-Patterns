public class ConcreteHandler2 extends Handler {

    @Override
    public void handleRequest() {
        System.out.println("Concrete2 isini yapti");
        if(nexHandler != null)
            nextHandler().handleRequest();
    }

    @Override
    public Handler nextHandler() {
        return nexHandler;
    }
    
}

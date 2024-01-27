public class ConcreteHandler1 extends Handler {

    @Override
    public void handleRequest() {
        System.out.println("Concrete1 isini yapti");
        if(nexHandler != null)
            nextHandler().handleRequest();
    }

    @Override
    public Handler nextHandler() {
        return nexHandler;
    }
    
}

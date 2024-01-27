public class Client {

    public void createChain(){
        ConcreteHandler1 concreteHandler1 = new ConcreteHandler1();
        ConcreteHandler2 concreteHandler2 = new ConcreteHandler2();

        concreteHandler1.setNexHandler(concreteHandler2);

        concreteHandler1.handleRequest();
    }
}
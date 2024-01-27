public class Client {

    IProductA iProductA;
    IProductB iProductB;
    public Client(IFactory factory) {
        iProductA = factory.generateProductA();
        iProductB = factory.generateProductB();
    }
    


    

}
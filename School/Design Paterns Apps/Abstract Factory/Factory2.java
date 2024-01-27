public class Factory2 extends IFactory{

    @Override
    public IProductA generateProductA() {
        return new ProductA2();
    }

    @Override
    public IProductB generateProductB() {
        return new ProductB2();
    }
    
}

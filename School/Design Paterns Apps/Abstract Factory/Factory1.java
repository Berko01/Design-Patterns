public class Factory1 extends IFactory {

    @Override
    public IProductA generateProductA() {
        return new ProductA1();
    }

    @Override
    public IProductB generateProductB() {

        return new ProductB1();
    }

}

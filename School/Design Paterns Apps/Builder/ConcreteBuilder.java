public class ConcreteBuilder implements IBuilder {
    Product product;

    public ConcreteBuilder() {
        this.product = new Product();
    }

    @Override
    public void buildPartA() {
        product.setPartB("Concrete Builder Part A");
    }

    @Override
    public void buildPartB() {
        product.setPartA("Concrete Builder Part B");
    }

    @Override
    public Product getProduct() {
        System.out.println(product.getPartA() + " " + product.getPartB());
       return product;
    }
    
    
}

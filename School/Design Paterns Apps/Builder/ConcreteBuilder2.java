public class ConcreteBuilder2 implements IBuilder {
    Product product;

    public ConcreteBuilder2() {
        this.product = new Product();
    }

    @Override
    public void buildPartA() {
        product.setPartB("Concrete Builder 2 Part A");
    }

    @Override
    public void buildPartB() {
        product.setPartA("Concrete Builder 2 Part B");
    }

    @Override
    public Product getProduct() {
        System.out.println(product.getPartA() + " " + product.getPartB());
       return product;
    }
    
    
}

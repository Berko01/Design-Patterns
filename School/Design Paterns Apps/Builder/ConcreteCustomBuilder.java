public class ConcreteCustomBuilder implements IBuilder {
    Product product;

    public ConcreteCustomBuilder() {
        this.product = new Product();
    }

    @Override
    public void buildPartA() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'buildPartA'");
    }

    @Override
    public void buildPartB() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'buildPartB'");
    }

    @Override
    public Product getProduct() {
        System.out.println("Custom concrete builder " + product.getPartA() + " " + product.getPartB());
        return product;
    }


    
    public void buildPartA(String partA) {
        product.setPartA(partA);
    }

    
    public void buildPartB(String partB) {
        product.setPartB(partB);
    }


 
}

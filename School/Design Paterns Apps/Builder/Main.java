public class Main {
    public static void main(String[] args) {
        Director director = new Director();

        ConcreteBuilder concreteBuilder = new ConcreteBuilder();
        ConcreteBuilder2 concreteBuilder2 = new ConcreteBuilder2();

        director.buildProduct(concreteBuilder);
        director.buildProduct(concreteBuilder2);

        concreteBuilder.getProduct();
        concreteBuilder2.getProduct();

        ConcreteCustomBuilder concreteCustomBuilder = new ConcreteCustomBuilder();

        director.buildProduct(concreteCustomBuilder, "Bu part A", "Bu part B");

        concreteCustomBuilder.getProduct();

        
    }
}

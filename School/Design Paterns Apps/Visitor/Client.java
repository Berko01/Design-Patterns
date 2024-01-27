public class Client {

    public static void main(String[] args) {
        ConcreteElement element = new ConcreteElement();
        ConcreteVisitor concreteVisitor = new ConcreteVisitor();

        element.accept(concreteVisitor);

        
    }
}
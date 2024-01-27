public class ConcreteVisitor implements IVisitor{

    @Override
    public void visit(IElement element) {
        if(element instanceof ConcreteElement)
        {
            System.out.println("Bu bir concrete element");
        }
    }

    
}

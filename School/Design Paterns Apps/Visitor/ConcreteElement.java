public class ConcreteElement implements IElement {

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
    
}

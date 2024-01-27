public class PlainText extends DocumentPart {

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
    
}

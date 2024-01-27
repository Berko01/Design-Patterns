public class PC implements IDevice{

    @Override
    public void visit(HpPrinter hpPrinter) {
        hpPrinter.print(this);
    }

    @Override
    public void visit(CanonPrinter canonPrinter) {
        canonPrinter.print(this);
    }

    @Override
    public Document getDocument() {

        return new Document("Selam beko!!!");
    }
    
}

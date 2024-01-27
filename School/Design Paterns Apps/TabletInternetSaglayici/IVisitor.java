public abstract class IVisitor {

    private String output = "";
    
    

    public abstract void visit(PlainText docPart);
    public abstract void visit(BoldText docPart);
    public abstract void visit(HyperLink docPart);
    
    public String getOutput() {
        return output;
    }
    public void setOutput(String output) {
        this.output = output;
    }
}

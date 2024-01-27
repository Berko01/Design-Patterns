public class HtmlVisitor extends IVisitor {

    @Override
    public void visit(PlainText docPart) {
        setOutput(getOutput()+ "<p>"+docPart.text+"</p>");
    }

    @Override
    public void visit(BoldText docPart) {
        setOutput(getOutput()+ "<b>"+docPart.text+"</b>");
    }

    @Override
    public void visit(HyperLink docPart) {
        setOutput(getOutput()+ "<a href =/ '' +docpart.Url+'/'>"+ docPart.text +"</a>");
    }
    
}

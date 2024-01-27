public class LatexVisitor extends IVisitor {

    @Override
    public void visit(PlainText docPart) {
        setOutput(getOutput() + "\\text{" + docPart.text + "}");
    }

    @Override
    public void visit(BoldText docPart) {
        setOutput(getOutput() + "\\textbf{" + docPart.text + "}");
    }

    @Override
    public void visit(HyperLink docPart) {
        setOutput(getOutput() + "\\href{" + docPart.url + "}{" + docPart.text + "}");
    }
    
    // Diğer LaTeX özelliklerini eklemek isterseniz buraya ekleyebilirsiniz.

}


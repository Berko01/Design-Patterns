public class Program {
    public static void main(String[] args) {
        PlainText docPart1 = new PlainText();
        HyperLink docPart2 = new HyperLink();
        BoldText docPart3 = new BoldText();

        docPart1.setText("Tasarim kaliplari, bir tecrubenin urunu" + "olarak ortaya cikmis tekniklerdir.");
        docPart2.setText("Kitap linki");
        docPart3.setText("C# ile tasarim kaliplari.");

        IVisitor htmlVisitor = new HtmlVisitor();


        docPart1.accept(htmlVisitor);
        docPart2.accept(htmlVisitor);
        docPart3.accept(htmlVisitor);

        System.out.println("Html Ciktiniz \n" + htmlVisitor.getOutput());


        IVisitor latexVisitor = new LatexVisitor();

        docPart1 = new PlainText();
        docPart2 = new HyperLink();
        docPart3 = new BoldText();

        docPart1.setText("Tasarim kaliplari, bir tecrubenin urunu" + "olarak ortaya cikmis tekniklerdir.");
        docPart2.setText("Kitap linki");
        docPart3.setText("C# ile tasarim kaliplari.");

       
        docPart1.accept(latexVisitor);
        docPart2.accept(latexVisitor);
        docPart3.accept(latexVisitor);

        System.out.println("Latex Ciktiniz \n" + latexVisitor.getOutput());
        
    }
}

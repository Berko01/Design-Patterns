package decorator;
public class SignedReportDecorator extends ReportDecorator{

    
    public SignedReportDecorator(Report report){super(report);}

    public String getText(){
        String text = super.getText();

        String signedText = ReportUtil.addSignedTextAtTheEnd(text);

        return signedText;
    }
}
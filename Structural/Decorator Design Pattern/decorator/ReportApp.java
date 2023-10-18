package decorator;

public class ReportApp {

    public static void main(String[] args) {
        String content = getReportContent();

       // String text = plainTextReportOutput(content);

       // String text = stripedReportOutput(content);

       // String text = stripedAndSmallReportDecorator(content);



       String text = stripedSmallSignedOutput(content);

        System.out.println(text);

    }

    private static String stripedSmallSignedOutput(String content) {
        PlainReport plainReport = new PlainReport(content);

           StripedReportDecorator stripedReportDecorator = new StripedReportDecorator(plainReport);

           SmallReportDecorator smallReportdecorator = new SmallReportDecorator(stripedReportDecorator);

           SignedReportDecorator decorator = new SignedReportDecorator(smallReportdecorator);

           String text = decorator.getText();
        return text;
    }

    private static String stripedAndSmallReportDecorator(String content) {
        PlainReport plainReport = new PlainReport(content);

        StripedReportDecorator stripedReportDecorator = new StripedReportDecorator(plainReport);

        SmallReportDecorator decorator = new SmallReportDecorator(stripedReportDecorator);

        String text = decorator.getText();
        return text;
    }

    private static String stripedReportOutput(String content) {
        PlainReport plainReport = new PlainReport(content);

        StripedReportDecorator decorator = new StripedReportDecorator(plainReport);

        String text = decorator.getText();
        return text;
    }

    private static String plainTextReportOutput(String content) {
        PlainReport plainReport = new PlainReport(content);

        String text = plainReport.getText();
        return text;
    }

    private static String getReportContent() {
        String content = "What is Lorem Ipsum?\n" +
                "\nLorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy "
                +
                "\ntext ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book."
                +
                "\nIt has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged."
                +
                "\nIt was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with"
                +
                "\ndesktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.";
        return content;

    }

}

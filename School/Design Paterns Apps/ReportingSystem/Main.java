public class Main {
    public static void main(String[] args) {
        Report report = new EmployeePerformanceReport(new DesktopFormat());
        report.display();

        System.out.println();

        Report report2 = new SalesReport(new WebFormat());

        report2.display();

        System.out.println();
    }
}

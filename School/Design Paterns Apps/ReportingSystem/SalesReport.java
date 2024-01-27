public class SalesReport extends Report{

    public SalesReport(IReportFormat reportFormat) {
        super(reportFormat);
    }

    @Override
    public void display(){
        System.out.println("---Satis Raporu ---");
        super.display();
    }



    
}

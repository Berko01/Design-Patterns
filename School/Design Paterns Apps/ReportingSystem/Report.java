public abstract class Report {

    public IReportFormat reportFormat;

    public IReportFormat getReportFormat() {
        return reportFormat;
    }

    public void setReportFormat(IReportFormat reportFormat) {
        this.reportFormat = reportFormat;
    }

    public Report(IReportFormat reportFormat){
        this.reportFormat = reportFormat;
    }

    public void display(){
        reportFormat.generate();
    }
     
}
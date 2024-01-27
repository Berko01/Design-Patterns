public class Adapter implements ITartget{
    private Adaptee adaptee;
    

    public Adapter() {
        this.adaptee = new Adaptee();
    }



    @Override
    public void doJob() {
        adaptee.benzersizIsYap();
    }
    
}

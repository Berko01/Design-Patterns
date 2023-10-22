public class Parent implements Observer{

    private String name;

    public Parent(String name){
        this.name = name;
    }

    public void update(Observable observable){
        Termometer termometer = (Termometer) observable;

        System.out.println(name + " dediki: ooo sicaklık "+termometer.getInstantTempature()+" derece olmuş!");
    }
    
}

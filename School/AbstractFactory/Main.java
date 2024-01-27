public class Main{
    public static void main(String[] args) {
        AbstractFactory aModel = new AModelFActory();        
        AbstractFactory bModel = new BModelFactory();
        AbstractFactory cModel = new CModelFactory();

        aModel.getEngine().start();
        bModel.getEngine().start();
        cModel.getEngine().start();

        System.out.println();

        aModel.getColor().fill();
        bModel.getColor().fill();
        cModel.getColor().fill();

        System.out.println();

        aModel.getGearbox().change();
        bModel.getGearbox().change();
        cModel.getGearbox().change();
        
        System.out.println();

        aModel.getWheel().rotate();       
        bModel.getWheel().rotate();
        bModel.getWheel().rotate();        
  







    }
}
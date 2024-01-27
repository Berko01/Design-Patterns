public class  AModelFActory extends AbstractFactory{
    

    public AModelFActory() {
        setEngine(new FourCyclinderEngine());
        setGearbox(new ManualGear());
        setWheel(new WinterTire());
        setColor(new White());
    
    }





}

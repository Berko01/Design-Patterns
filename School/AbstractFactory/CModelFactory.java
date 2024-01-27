public class CModelFactory extends AbstractFactory {

    public CModelFactory() {
        
        setEngine(new ThreeCylinderEngine());
        setGearbox(new AutomaticTransmission());
        setWheel(new SummerTire());
        setColor(new Red());
    }
    

}

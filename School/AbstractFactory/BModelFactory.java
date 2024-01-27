public class BModelFactory extends AbstractFactory {

    public BModelFactory() {
      
        setEngine(new ThreeCylinderEngine());
        setGearbox(new AutomaticTransmission());
        setWheel(new WinterTire());
        setColor(new Black());
    
    }
    

}

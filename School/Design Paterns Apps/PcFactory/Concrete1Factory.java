public class Concrete1Factory extends PcFactory {

    @Override
    public HddAbstract hddAbstract() {
        return new HddConcrete1();
    }

    @Override
    public RamAbstract ramAbstract() {
        return new RamConcrete1();
    }

    
    
}

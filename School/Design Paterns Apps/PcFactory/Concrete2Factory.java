public class Concrete2Factory extends PcFactory {

    @Override
    public HddAbstract hddAbstract() {
        return new HddConcrete2();
    }

    @Override
    public RamAbstract ramAbstract() {
        return new RamConcrete2();
    }
    
}

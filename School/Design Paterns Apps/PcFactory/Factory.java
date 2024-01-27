public class Factory {

    private PcFactory pcFactory;
    private HddAbstract hddAbstract;
    private RamAbstract ramAbstract;

    public Factory(PcFactory pcFactory) {
        this.pcFactory = pcFactory;
        this.hddAbstract = pcFactory.hddAbstract();
        this.ramAbstract = pcFactory.ramAbstract();

    }

    public void Birlestir(){
        System.out.println(hddAbstract.HddTur());
        hddAbstract.HddIslem();

        System.out.println(ramAbstract.RamTur());
        ramAbstract.RamIslem();

    }

}
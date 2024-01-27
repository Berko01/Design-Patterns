public class GoldPC implements IBilgisayarToplayicisi{
    private Bilgisayar mBilgisayar;

    public GoldPC() {
        mBilgisayar = new Bilgisayar("Gold-PC");
    }

    @Override
    public Bilgisayar Bilgisayar() {
        return mBilgisayar;
    }

    @Override
    public void hddOlustur() {
        mBilgisayar.getHashTable().put("hdd", "60 GB Seagate");
    }

    @Override
    public void cdRomOlustur() {
        mBilgisayar.getHashTable().put("cdrom", "52X GoldStar");
    }

    @Override
    public void monitorOlustur() {
        mBilgisayar.getHashTable().put("monitor", "17' Hyundai");
    }

    @Override
    public void ramOlustur() {
        mBilgisayar.getHashTable().put("ram", "512 MB DDR Kingston");
    }
    
    
}

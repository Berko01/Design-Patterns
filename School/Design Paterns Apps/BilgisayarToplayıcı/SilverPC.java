public class SilverPC implements IBilgisayarToplayicisi{
    Bilgisayar mBilgisayar;
    

    public SilverPC() {
        this.mBilgisayar = new Bilgisayar("Silver-PC");
    }

    @Override
    public Bilgisayar Bilgisayar() {
        return mBilgisayar;
    }

    @Override
    public void hddOlustur() {
        mBilgisayar.getHashTable().put("hdd", "30 GB Maxtor");
    }

    @Override
    public void cdRomOlustur() {
        mBilgisayar.getHashTable().put("hdd", "60 GB Seagate");
    }

    @Override
    public void monitorOlustur() {
        mBilgisayar.getHashTable().put("monitor", "15' Vestel");
    }

    @Override
    public void ramOlustur() {
        mBilgisayar.getHashTable().put("ram", "256 MB SD Kingston");
    }
    
}

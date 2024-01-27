import java.util.Hashtable;

public class Bilgisayar {
    private String mBilgisayarTipi;
    Hashtable<String, String> mParcalar = new Hashtable<>();

    public Hashtable<String, String> getHashTable() {
        return mParcalar;
    }

    public void setHashTable(Hashtable<String, String> mParcalar) {
        this.mParcalar= mParcalar;
    }

    public Bilgisayar(String mBilgisayarTipi) {
        this.mBilgisayarTipi = mBilgisayarTipi;
    }

    public void bilgisayariGoster(){
        System.out.println("Bilgisayar Tipi: " + mBilgisayarTipi);
        System.out.println("CD-ROM Model " + mParcalar.get("cdrom"));
        System.out.println("Hard Disk Model: " + mParcalar.get("hdd"));
        System.out.println("Monitor Model: " + mParcalar.get("monitor"));
        System.out.println("Ram Model: " + mParcalar.get("ram"));
    }


}

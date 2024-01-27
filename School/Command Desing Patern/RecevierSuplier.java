
public class RecevierSuplier {
    private int suplierId;
    private String suplierName;

    public RecevierSuplier(int suplierId, String suplierName) {
        this.suplierId = suplierId;
        this.suplierName = suplierName;
    }

    public void enable(){
        System.out.println("-" + suplierId + " id'li" + suplierName + "adli supplier aktif edildi.");
    }

    public void disable(){
        System.out.println("-" + suplierId + " id'li" + suplierName + "adli supplier pasif edildi.");
    }
}

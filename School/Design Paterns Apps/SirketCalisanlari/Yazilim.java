public class Yazilim extends Sirket {

    public Yazilim(String isim, Bolum departman) {
        super(isim, departman);
    }

    @Override
    public void ekle(Sirket ys) {
    }

    @Override
    public void sil(Sirket ys) {
    }

    @Override
    public void yazdir(int satirBasi) {
        System.out.println("- " + satirBasi + "> " + this.isim + " - " + this.departman);
    }
    
}

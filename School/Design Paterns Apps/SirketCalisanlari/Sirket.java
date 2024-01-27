public abstract class Sirket {
    protected String isim;
    protected Bolum departman;

    public Sirket(String isim, Bolum departman) {
        this.isim = isim;
        this.departman = departman;
    }
    
    public abstract void ekle(Sirket ys);
    public abstract void sil(Sirket ys);
    public abstract void yazdir(int satirBasi);
    
}
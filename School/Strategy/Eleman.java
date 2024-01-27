public class Eleman {
    public MaasHesap maasHesap;
    public IzinHesap izinHesap;

    public Eleman(MaasHesap maasHesapla, IzinHesap izinHesapla) {
        this.maasHesap = maasHesapla;
        this.izinHesap = izinHesapla;
    }

    public int izinHesapla(){
        return izinHesap.izinHesapla();
    }

    public int maasHesapla(){
        return maasHesap.maasHesapla();
    }
}

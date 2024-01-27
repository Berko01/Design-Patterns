public class Facade{
    public Facade() {
        tcKimlikSistem = new TcKimlikSistem();
        sistem1Kontrol = new Sistem1Kontrol();
        sistem2Operations = new Sistem2Operations();
    }

    Sistem1Kontrol sistem1Kontrol;
    Sistem2Operations sistem2Operations;
    TcKimlikSistem tcKimlikSistem;

    public void sistem2UyeEkle(String tc){
        if(tcKimlikSistem.kontrol() && !sistem1Kontrol.karaListeKontrol()){
            sistem2Operations.uyeEkle(tc);
        }


    }
}
public class TeknikServis {
    public void bilgisayarTopla(IBilgisayarToplayicisi bilgisayarToplayicisi){
        bilgisayarToplayicisi.cdRomOlustur();
        bilgisayarToplayicisi.hddOlustur();
        bilgisayarToplayicisi.monitorOlustur();
        bilgisayarToplayicisi.ramOlustur();
    }
}

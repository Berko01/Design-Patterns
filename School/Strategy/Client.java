public class Client {

    public static void main(String[] args) {
        Eleman eleman = new Eleman(new YoneticiMaasHesap(), new DepartmanAIzinHesapla());
        int yoneticiMaas = eleman.maasHesapla();
        int yoneticiIzin = eleman.izinHesapla();

        eleman = new Eleman(new MuhendisMaasHesap(), new DepartmanBIzinHesapla());
        int muhendisMaas = eleman.maasHesapla();
        int muhendisIzin = eleman.izinHesapla();

        eleman = new Eleman(new TeknisyenMaasHesap(), new DepartmanBIzinHesapla());
        int teknisyenMaas = eleman.maasHesapla();
        int teknisyenIzin = eleman.izinHesapla();


        System.out.println("Yonetici maasi: " + yoneticiMaas + " Yonetici Izini: " + yoneticiIzin);
        System.out.println("Muhendis maasi: " + muhendisMaas + " Muhendis Izini: " + muhendisIzin);
        System.out.println("Teknisyen maasi: " + teknisyenMaas + " Teknisyen Izini: " + teknisyenIzin);

    }
}
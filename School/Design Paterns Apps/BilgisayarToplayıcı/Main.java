public class Main {
    public static void main(String[] args) {
        TeknikServis teknikServis = new TeknikServis();

        IBilgisayarToplayicisi bT1 = new GoldPC();
        IBilgisayarToplayicisi bT2 = new SilverPC();

        teknikServis.bilgisayarTopla(bT1);
        teknikServis.bilgisayarTopla(bT2);

        bT1.Bilgisayar().bilgisayariGoster();
        System.out.println();
        bT2.Bilgisayar().bilgisayariGoster();

        



    }
}

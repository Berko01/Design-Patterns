public class MainApp {
    public static void main(String[] args) {
        Yazilim yazilim2 = new Yazilim("Sabo", Bolum.Junior);
        Yazilim testci = new Yazilim("Ramo", Bolum.Test);
        Yazilim testci2 = new Yazilim("Orkun", Bolum.Test);
        Yazilim analistci = new Yazilim("Ahmet", Bolum.Analist);

        Kadro senior = new Kadro("Beko",Bolum.Senior);
        Kadro arge = new Kadro("Celo", Bolum.Arge);

        
        

        

        arge.ekle(analistci);
        arge.ekle(testci2);
        
        senior.ekle(testci);
        senior.ekle(yazilim2);
        senior.ekle(arge);

        senior.yazdir(0);





    }
}

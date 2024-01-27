import java.util.ArrayList;

public class Kadro extends Sirket {
    private ArrayList<Sirket> liste = new ArrayList<>();


    public Kadro(String isim, Bolum departman) {
        super(isim, departman);
    }

    @Override
    public void ekle(Sirket ys) {
        liste.add(ys);
    }

    @Override
    public void sil(Sirket ys) {
        liste.remove(ys);
    }

    @Override
    public void yazdir(int satirBasi) {
        System.out.println(isim + " - " + departman);
        for (Sirket u : liste) {
            u.yazdir(satirBasi + 2);
        }
    }
    
}

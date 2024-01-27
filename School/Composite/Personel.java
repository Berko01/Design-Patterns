import java.util.ArrayList;

public abstract class Personel {
    protected ArrayList<Personel> personelList = new ArrayList<>();

    public void add(Personel personel){
        personelList.add(personel);

    }

    public void remove(Personel personel){
        personelList.remove(personel);
    }

    public abstract void showInfos();

    
}

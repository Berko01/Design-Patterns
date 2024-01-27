import java.util.ArrayList;

public class TakipEdilenNesne {
    ArrayList<AbstractObserver> observerList = new ArrayList<>();

    public void observerEkle(AbstractObserver observer){
        observerList.add(observer);
    }

    public void observerSil(AbstractObserver observer){
        observerList.remove(observer);

    }

    public void observerlaraHaberver(){
        for(AbstractObserver observer: observerList){
            observer.update();
        }

    }
}

import java.util.ArrayList;
import java.util.List;

public abstract class Observable {
    private List<Observer> observerList;

    public Observable(){
        observerList = new ArrayList<>();
    }

    public void add(Observer observer){
        observerList.add(observer);
    }

    public void remove(Observer observer){
        observerList.remove(observer);
    }

    public void notifyObservers(){
        for(Observer observer : observerList){

            observer.update(this);
        }
    }
}
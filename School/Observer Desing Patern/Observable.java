import java.util.ArrayList;
import java.util.List;

public abstract class Observable {
    private List<IObserver> observerList;

    public Observable(){
        observerList = new ArrayList<>();
    }

    public void  add(IObserver observer){
        observerList.add(observer);
    }

    public void remove(IObserver observer){
        observerList.remove(observer);
    }

    public void notifyObservers(Post post){
        for(IObserver observer : observerList){

            observer.update(post);
        }
    }
}
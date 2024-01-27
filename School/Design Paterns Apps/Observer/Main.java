
public class Main {
    public static void main(String[] args) {
        ConcreteObserverA observerA = new ConcreteObserverA();

        ConcreteObserverB observerB = new ConcreteObserverB();

        TakipEdilenNesne takipEdilenNesne = new TakipEdilenNesne();

        takipEdilenNesne.observerEkle(observerB);
        takipEdilenNesne.observerEkle(observerA);

        takipEdilenNesne.observerlaraHaberver();
    }
}

//Singleton Design Pattern.
//İlgili nesneden bir tane oluşsun istiyoruz.

public class Singleton {

    private static Singleton singleton;
    private static int number = 0;

    private Singleton() {

        System.out.println("Ben olustum. SIkIyorsa bir daha olustur.");
    }

    public static Singleton getSingleton() {

            synchronized (Singleton.class) { //thread safe
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }

        
        number++;
        System.out.println();

        return singleton;
    }

}
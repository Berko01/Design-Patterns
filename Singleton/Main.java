public class Main {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new SingletonThread());
        Thread thread2 = new Thread(new SingletonThread());

        thread1.start();
        thread2.start();
    }
}

class SingletonThread implements Runnable {
    @Override
    public void run() {
        Singleton singleton = Singleton.getSingleton();
        System.out.println("Thread ID: " + Thread.currentThread().getId() + " - Singleton Instance Hash Code: " + singleton.hashCode());
    }
}
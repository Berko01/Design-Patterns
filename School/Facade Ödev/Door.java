public class Door {

    private boolean locked;

    public Door() {
        this.locked = false;
    }

    public void lock() {
        if (!locked) {
            locked = true;
            System.out.println("Kapi kilitlendi.");
        } else {
            System.out.println("Kapi zaten kilitli.");
        }
    }

    public void unlock() {
        if (locked) {
            locked = false;
            System.out.println("Kapi acildi.");
        } else {
            System.out.println("Kapi zaten acik.");
        }
    }

    public static void main(String[] args) {
        Door door = new Door();
        door.lock();
        door.lock();
        door.unlock();
    }
}

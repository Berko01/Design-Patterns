public class Client {

    public static void main(String[] args) {
        ITartget target = new Adapter();

        target.doJob();
    }
}
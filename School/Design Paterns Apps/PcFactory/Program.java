public class Program {
    public static void main(String[] args) {
        Factory f = new Factory(new Concrete1Factory());

        f.Birlestir();
        System.out.println();

        f = new Factory(new Concrete2Factory());
        f.Birlestir();
        System.out.println();

    }
}

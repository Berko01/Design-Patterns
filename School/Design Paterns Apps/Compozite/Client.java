public class Client {

    public static void main(String[] args) {
        Leaf leaf = new Leaf();
        Leaf leaf2 = new Leaf();

        Composite composite = new Composite();
        Composite composite2 = new Composite();


        composite2.add(leaf2);
        composite.add(leaf);
        composite.add(composite2);

        composite.getChild(0);



    }
}
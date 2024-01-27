public class Main {
    public static void main(String[] args) {
        PC pc = new PC();
        Tablet tablet = new Tablet();

        HpPrinter hpPrinter = new HpPrinter();
        CanonPrinter canonPrinter = new CanonPrinter();

        hpPrinter.print(pc);
        canonPrinter.print(tablet);
    





    }
}

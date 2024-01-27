public class CanonPrinter implements IPcPrinter, ITabletPrinter {


    @Override
    public void print(Tablet tablet) {
        System.err.println("Canon Printer:");
        System.out.println("Hp-Tabletten print ediliyor..." + tablet.getDocument().getText());
    }

    @Override
    public void print(PC pc) {
        System.err.println("Canon Printer:");
        System.out.println("PC'den print ediliyor..." + pc.getDocument().getText());
    }

    
}

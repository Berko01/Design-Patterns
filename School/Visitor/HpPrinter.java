public class HpPrinter implements IPcPrinter, ITabletPrinter {

    @Override
    public void print(Tablet tablet) {
        System.err.println("Hp Printer:");
        System.out.println("Hp-Tabletten print ediliyor..." + tablet.getDocument().getText());
    }

    @Override
    public void print(PC pc) {
        System.err.println("Hp Printer:");
        System.out.println("PC'den print ediliyor..." + pc.getDocument().getText());
    }


    
}

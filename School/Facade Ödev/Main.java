public class Main {

    public static void main(String[] args) {
        SmartHomeSystem smartHome = new SmartHomeSystem();
        SmartHomeFacade akilliEvFacade = new SmartHomeFacade(smartHome);

        System.out.println("Akilli ev acilma modu.");
        akilliEvFacade.eviAc();

        System.out.println();

        System.out.println("Akilli ev kapatilma modu.");
        akilliEvFacade.eviKapat();
    }
}

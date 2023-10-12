public class Freezer implements ElectricalAppliances{
    private int volt;

    public Freezer(){
        this.volt = 200;
    }

    @Override
    public int plugAndPlay() {
        System.out.println("Buzdolabi calisiyor");
        return this.volt;
    }
}
public class Iron implements ElectricalAppliances {
    
    private int volt;

    public Iron(){
        this.volt = 200;
    }

    @Override
    public int plugAndPlay() {
        System.out.println("Utu calisiyor");
        return this.volt;
    }

    

}

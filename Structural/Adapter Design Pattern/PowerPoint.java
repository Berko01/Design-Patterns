

public class PowerPoint {
    public void giveElectricity(ElectricalAppliances electricalAppliances){
        int volt = electricalAppliances.plugAndPlay();

        System.out.println("Prizden " + volt + " volt aliniyor.");
    }
}
public class SamsungTelephone implements Telephone {

    private int operatingVoltage;

    public SamsungTelephone(){
        this.operatingVoltage = 5;
    }
    @Override
    public int chargeIt() {
        System.out.println("Telefon sarj ediliyor.");
        return this.operatingVoltage;
    }
    
}

public class AirConditioner {

    private int temperature;
    private boolean isOn;

    public AirConditioner() {
        this.temperature = 0;
        this.isOn = false;
    }

    public void updateTemperature(int newTemperature) {
        this.temperature = newTemperature;
        System.out.println("Sicaklik guncellendi: " + newTemperature + " derece");
    }

    public void turnOn() {
        if (!isOn) {
            isOn = true;
            System.out.println("Klima acildi.");
        } else {
            System.out.println("Klima zaten acik.");
        }
    }

    public void turnOff() {
        if (isOn) {
            isOn = false;
            System.out.println("Klima kapatildi.");
        } else {
            System.out.println("Klima zaten kapali.");
        }
    }

}


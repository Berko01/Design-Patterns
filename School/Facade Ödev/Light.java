public class Light {

    private boolean isOn;

    public Light() {
        this.isOn = false;
    }

    public void turnOn() {
        if (!isOn) {
            isOn = true;
            System.out.println("Isik acildi.");
        } else {
            System.out.println("Isik zaten acik.");
        }
    }

    public void turnOff() {
        if (isOn) {
            isOn = false;
            System.out.println("Isik kapatildi.");
        } else {
            System.out.println("Isik zaten kapali.");
        }
    }

    public static void main(String[] args) {
        Light light = new Light();
        light.turnOn();
        light.turnOn();
        light.turnOff();
    }
}

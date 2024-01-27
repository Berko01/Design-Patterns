public class SmartHomeSystem {

    private AirConditioner airConditioner;
    private Light light;
    private Door door;

    public SmartHomeSystem() {
        light = new Light();
        airConditioner = new AirConditioner();
        door = new Door();
    }

    public void lockDoor() {
        door.lock();
    }

    public void unlockDoor() {
        door.unlock();
    }

    public void turnOnLight() {
        light.turnOn();
    }

    public void turnOffLight() {
        light.turnOff();
    }

    public void turnOnAirConditioner() {
        airConditioner.turnOn();
    }

    public void turnOffAirConditioner() {
        airConditioner.turnOff();
    }

    public void setAirConditionerTemperature(int newTemperature) {
        airConditioner.updateTemperature(25);
    }

}

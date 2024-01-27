class SmartHomeFacade {

    private SmartHomeSystem smartHome;

    public SmartHomeFacade(SmartHomeSystem smartHome) {
        this.smartHome = smartHome;
    }

    public void eviAc() {
        smartHome.unlockDoor();
        smartHome.turnOnLight();
        smartHome.turnOnAirConditioner();
    }

    public void eviKapat() {
        smartHome.lockDoor();
        smartHome.turnOffLight();
        smartHome.turnOffAirConditioner();
    }
}
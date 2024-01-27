public abstract class AbstractFactory {
    IEngine engine;
    IColor color;
    IGearbox gearbox;
    IWheel wheel;

    
    public AbstractFactory() {

    }
    public IEngine getEngine() {
        return engine;
    }
    public void setEngine(IEngine engine) {
        this.engine = engine;
    }
    public IColor getColor() {
        return color;
    }
    public void setColor(IColor color) {
        this.color = color;
    }
    public IGearbox getGearbox() {
        return gearbox;
    }
    public void setGearbox(IGearbox gearbox) {
        this.gearbox = gearbox;
    }
    public IWheel getWheel() {
        return wheel;
    }
    public void setWheel(IWheel wheel) {
        this.wheel = wheel;
    }
    
}

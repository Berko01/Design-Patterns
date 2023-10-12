public class Iphone14 implements Telephone {

    private String model;
    private String battery;
    private int width;
    private int length;

    public Iphone14(String model, String battery, int width, int length) {
        this.model = model;
        this.battery = battery;
        this.width = width;
        this.length = length;
    }

    @Override
    public String getModel() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getModel'");
    }

    @Override
    public String getBattery() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getBattery'");
    }

    @Override
    public int getWidth() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getWidth'");
    }

    @Override
    public int getLength() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getLength'");
    }

    @Override
    public String toString() {
        return "Iphone14 [Model: " + getModel() + ", Battery: " + getBattery() +
                ", Width: " + getWidth() + ", Length: " + getLength() + "]";
    }

}

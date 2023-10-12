public class Iphone14 implements Telephone {

    @Override
    public String toString() {
        return "Iphone14 [model=" + model + ", battery=" + battery + ", width=" + width + ", length=" + length + "]";
    }

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
        return this.model;
    }

    @Override
    public String getBattery() {
        // TODO Auto-generated method stub
        return this.battery;
    }

    @Override
    public int getWidth() {
        // TODO Auto-generated method stub
        return this.width;
    }

    @Override
    public int getLength() {
        // TODO Auto-generated method stub
        return this.length;
    }



}



public class Iphone14Factory implements TelephoneFactory{
    public  Telephone getTelephone(String model, String battery, int width, int length){
        return new Iphone14(model, battery, width, length);
    }
}

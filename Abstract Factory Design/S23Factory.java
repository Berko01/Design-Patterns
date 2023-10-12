public class S23Factory implements TelephoneFactory{

    @Override
    public Telephone getTelephone(String model, String battery, int width, int length) {
        return new S23(model, battery, width, length);
    }

}
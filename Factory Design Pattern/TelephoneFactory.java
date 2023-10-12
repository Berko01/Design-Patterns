

class TelephoneFactory {
    public static Telephone getTelephone(String model, String battery, int width, int length) {

        Telephone telephone;

        if ("S23".equalsIgnoreCase(model)) {
            telephone = new S23(model, battery, width, length);
        } else if ("Iphone14".equalsIgnoreCase(model))
            {
                telephone = new Iphone14(model, battery, width, length);
            }
        else {
            throw new RuntimeException("Geçerli model değil");
        }

        return telephone;

    }

}
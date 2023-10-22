public class App {
    public static void main(String[] args) {
        ShippingCompany sbmShipping = SbmShipping.getShippingCompany();

        sbmShipping.ship(EnumCity.KARS);

        System.out.println("\n-------------\n");

        sbmShipping.ship(EnumCity.ANTALYA);

        System.out.println("\n-------------\n");

        sbmShipping.ship(EnumCity.ISTANBUL);

        System.out.println("\n-------------\n");

        sbmShipping.ship(EnumCity.CANKIRI);

        System.out.println("\n-------------\n");

        sbmShipping.ship(EnumCity.ANKARA);


    }
}

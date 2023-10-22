public abstract class ShippingCompany {
    
    private EnumCity enumCity;
    private ShippingCompany nextShippingCompany;


    public ShippingCompany(EnumCity enumCity, ShippingCompany nextShippingCompany) {
        this.enumCity = enumCity;
    }

    public ShippingCompany(EnumCity enumCity){
        this.enumCity = enumCity;
    }

    public EnumCity getEnumCity() {
        return enumCity;
    }

    public void setEnumCity(EnumCity enumCity) {
        this.enumCity = enumCity;
    }

    public ShippingCompany getNextShippingCompany() {
        return nextShippingCompany;
    }

    public ShippingCompany setNextShippingCompany(ShippingCompany nextShippingCompany) {
        this.nextShippingCompany = nextShippingCompany;

        return this;
    }

    public void ship(EnumCity city){

        
        printIncomingCargoInformation(city);

        if(getEnumCity().equals(city)){

            printCargoDeliveryInformation();

        } else if( getNextShippingCompany() != null){

            getNextShippingCompany().ship(city);

        }else{
            printOutOfServiceAreaInformation(city);
        }
    }

    
    private void printOutOfServiceAreaInformation(EnumCity city) {
        System.out.println(city.getCity() + " Hizmet alaninin disindadir.");
    }

    private void printCargoDeliveryInformation() {
        System.out.println(getEnumCity().getCity() + " sube teslim aldi.");
    }

    private void printIncomingCargoInformation(EnumCity city) {
        System.out.println(city.getCity() + " iline gidecek kargo " + getEnumCity().getCity() + " subesine geldi.");
    }


}

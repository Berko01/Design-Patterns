public enum EnumCity{

    ISTANBUL("Istanbul"),
    ANKARA("Ankara"),
    ANTALYA("Antalya"),
    CANKIRI("Cankiri"),
    KARS("Kars");

    private String city;

    EnumCity(String city){
        this.city = city;
    }

    public String getCity(){
        return city;
    }

    public String toString(){
        return city;
    }

}
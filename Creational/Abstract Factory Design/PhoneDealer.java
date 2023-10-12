public class PhoneDealer {

    public static void main(String[] args) {
        S23Factory s23Factory= new S23Factory();
        Telephone s23 = s23Factory.getTelephone("s23","2600mah",4,7);
        
        Iphone14Factory iphone14Factory = new Iphone14Factory();
        Telephone iphone14 = iphone14Factory.getTelephone("Iphone14","3600mah",5,8);

        System.out.println(s23);
        System.out.println(iphone14);
    }


}

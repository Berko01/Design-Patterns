import java.math.BigDecimal;

public class App {
    public static void main(String[] args) {
        BigDecimal minTempature = BigDecimal.valueOf(23);
        BigDecimal maxTempature = BigDecimal.valueOf(28);

        Termometer termometer = new Termometer(minTempature,maxTempature);

        Parent mother = new Parent("Anne");
        Parent father = new Parent("Father");

        termometer.add(mother);
        termometer.add(father);

        for(int i = termometer.getInstantTempature().intValue(); i<30;i++)
        {
            termometer.setInstantTempature(BigDecimal.valueOf(i));
        }

        for(int i= termometer.getInstantTempature().intValue(); i>20; i--){
            System.out.println("hata burada mi");
            termometer.setInstantTempature(BigDecimal.valueOf(i));
        }


    }
}

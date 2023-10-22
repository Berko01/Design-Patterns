import java.math.BigDecimal;

public class Termometer extends Observable {
    private BigDecimal instantTempature;
    private BigDecimal minTempature;
    private BigDecimal maxTempature;

    public Termometer(BigDecimal minTempature, BigDecimal maxTempature) {
     
        this.minTempature = minTempature;
        this.maxTempature = maxTempature;
        this.instantTempature = BigDecimal.valueOf(24);
    }

    public BigDecimal getInstantTempature() {
        return instantTempature;
    }

    public void setInstantTempature(BigDecimal instantTempature) {
        this.instantTempature = instantTempature;

        System.out.println(instantTempature);

        checkTempature();
    }



    private void checkTempature(){

        boolean isSoHot = instantTempature.compareTo(maxTempature) >= 0;
        boolean isSoCold = instantTempature.compareTo(minTempature)<= 0;

        if(isSoHot || isSoCold){
            notifyObservers();
        }

    }

    


}

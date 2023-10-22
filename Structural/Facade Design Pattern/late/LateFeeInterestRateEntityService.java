package late;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class LateFeeInterestRateEntityService{

    public BigDecimal getLateFeeInterestRate() {

        BigDecimal rate = new BigDecimal("1.6");

        rate = rate.divide(new BigDecimal(100), 4,RoundingMode.HALF_DOWN);

        return rate;
    }

}
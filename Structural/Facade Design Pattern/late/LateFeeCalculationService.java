package late;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Date;

import date.DateUtil;

public class LateFeeCalculationService {

    LateFeeInterestRateEntityService lateFeeInterestRateEntityService;

    public LateFeeCalculationService() {
        this.lateFeeInterestRateEntityService = new LateFeeInterestRateEntityService();
    }

    public BigDecimal lateFee(BigDecimal amount, Date expiryDate) {
        BigDecimal lateFee = BigDecimal.ZERO;

        if (expiryDate.compareTo(new Date()) > 0) {
            return lateFee;
        }

        lateFee = calculateLateFee(amount, expiryDate);

        return lateFee;
    }

    public BigDecimal calculateLateFee(BigDecimal amount, Date expiryDate) {

        BigDecimal lateFeeInterestRate = lateFeeInterestRateEntityService.getLateFeeInterestRate();

        Date currentDate = DateUtil.getCurrentDate();

        long dayDifferenceL = DateUtil.calculateDayDifference(expiryDate, currentDate);

        BigDecimal dayDifference = BigDecimal.valueOf(dayDifferenceL);

        BigDecimal lateFee = lateFeeInterestRate.multiply(dayDifference).multiply(amount);

        lateFee = lateFee.setScale(2, RoundingMode.HALF_DOWN);

        if (lateFee.compareTo(BigDecimal.ZERO) > 0) {
            System.out.println("Bilgi: Gecikme zammi hesaplandi. Gecikme Zammi Tutari: " + lateFee);
        }

        return lateFee;

    }

}

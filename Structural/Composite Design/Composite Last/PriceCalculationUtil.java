import java.math.BigDecimal;
import java.util.List;

public class PriceCalculationUtil {
    
    public static BigDecimal getTotalProductAmount(List<Product> productList) {
        BigDecimal totalAmount = BigDecimal.ZERO;

        for (Product product : productList) {
            totalAmount = totalAmount.add(product.getPrice());
        }
        return totalAmount;
    }

    public static BigDecimal getTotalPackAmount(List<Pack> packList) {
        BigDecimal totalAmount = BigDecimal.ZERO;

        for (Pack pack : packList) {
            totalAmount = totalAmount.add(pack.getPrice());
        }

        return totalAmount;
    }
}

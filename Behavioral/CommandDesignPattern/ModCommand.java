import java.math.BigDecimal;

public class ModCommand implements Operation {

    @Override
    public BigDecimal operation(BigDecimal num1, BigDecimal num2) {
        // TODO Auto-generated method stub
        return num1.remainder(num2);
    }

}

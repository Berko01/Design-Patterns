import java.math.BigDecimal;

public class ExponentiationCommand implements Operation{

    @Override
    public BigDecimal operation(BigDecimal num1, BigDecimal num2) {
        // TODO Auto-generated method stub
        return num1.pow(num2.intValue());
    }

}

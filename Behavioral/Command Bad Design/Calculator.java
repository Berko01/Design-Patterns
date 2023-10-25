import java.math.BigDecimal;

public class Calculator {

    public static BigDecimal calculate(OperationType operationType, BigDecimal number1, BigDecimal number2) {

        BigDecimal result = BigDecimal.ZERO;

        if (OperationType.ADDITION.equals(operationType)) {
            result = number1.add(number2);
        } else if (OperationType.SUBTRACTION.equals(operationType)) {
            result = number1.subtract(number2);
        } else if (OperationType.MULTIPLICATION.equals(operationType)) {
            result = number1.multiply(number2);
        } else if (OperationType.DIVISION.equals(operationType)) {
            result = number1.divide(number2);
        } else if (OperationType.EXPONENTIATION.equals(operationType)) {
            result = number1.pow(number2.intValue());
        } else if (OperationType.MODULUS.equals(operationType)) {
            result = number1.remainder(number2);
        }

        return result;
    }
}
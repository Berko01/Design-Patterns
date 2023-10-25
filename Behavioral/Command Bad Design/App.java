import java.math.BigDecimal;

public class App {

    public static void main(String[] args) {

        BigDecimal sum = Calculator.calculate(OperationType.ADDITION, BigDecimal.TEN, BigDecimal.ONE);
        BigDecimal difference = Calculator.calculate(OperationType.SUBTRACTION, BigDecimal.TEN, BigDecimal.ONE);
        BigDecimal exponentiation = Calculator.calculate(OperationType.EXPONENTIATION, BigDecimal.TEN, BigDecimal.valueOf(2));
        BigDecimal modulus = Calculator.calculate(OperationType.MODULUS, BigDecimal.TEN, BigDecimal.valueOf(3));

        

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Exponentiation: " + exponentiation);
        System.out.println("Modulus: " + modulus);
    }
}


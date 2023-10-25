import java.math.BigDecimal;

public class App2 {

    public static void main(String[] args) {

        BigDecimal num1 = BigDecimal.TEN;
        BigDecimal num2 = BigDecimal.valueOf(2);

        BigDecimal addition = Calculator2.operation(new AdditionCommand(), num1, num2);
        BigDecimal subtraction = Calculator2.operation(new SubtractionCommand(), num1, num2);
        BigDecimal multiplication = Calculator2.operation(new MultiplicationCommand(), num1, num2);
        BigDecimal division = Calculator2.operation(new DivisionCommand(), num1, num2);
        BigDecimal exponentiation = Calculator2.operation(new ExponentiationCommand(), num1, num2);
        BigDecimal mod = Calculator2.operation(new ModCommand(), num1, num2);


        System.out.println("Toplam: " + addition);
        System.out.println("Fark: " + subtraction);
        System.out.println("Çarpma: " + multiplication);
        System.out.println("Bölme: " + division);
        System.out.println("Üst: " + exponentiation);
        System.out.println("Mod: " + mod);
    }
}
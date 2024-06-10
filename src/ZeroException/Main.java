package ZeroException;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        try {
            double result = calculator.divide(10.0, 2.0);
            System.out.println("Result: " + result);

            // Uncomment the line below to test division by zero
            // double invalidResult = calculator.divide(5.0, 0.0);
        } catch (DivisionByZeroException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

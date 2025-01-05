import java.util.Scanner;

public class Calculator {
    private Scanner scanner;

    public Calculator() {
        this.scanner = new Scanner(System.in);
    }

    // Add two numbers
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    // Subtract num2 from num1
    public int subtract(int num1, int num2) {
        return num1 - num2;
    }

    // Multiply two numbers
    public int multiply(int num1, int num2) {
        return num1 * num2;
    }

    
    public double divide(int num1, int num2) {
        if (num2 != 0) {
            return (double) num1 / num2;
        } else {
            System.out.println("Error: Division by zero.");
            return Double.NaN; // NaN (Not a Number) represents an undefined result
        }
    }

    public void performCalculations() {
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        int resultAdd = add(num1, num2);
        int resultSubtract = subtract(num1, num2);
        int resultMultiply = multiply(num1, num2);
        double resultDivide = divide(num1, num2);

        System.out.println("Addition: " + resultAdd);
        System.out.println("Subtraction: " + resultSubtract);
        System.out.println("Multiplication: " + resultMultiply);
        System.out.println("Division: " + resultDivide);
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.performCalculations();
    }
}

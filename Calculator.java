import java.util.ArrayList;
import java.util.Scanner;

// Calculator class to perform arithmetic operations
class Calculator {
    private ArrayList<String> history; // To store history of operations

    // Constructor
    public Calculator() {
        history = new ArrayList<>();
    }

    // Perform addition and update history
    public double add(double num1, double num2) {
        double result = num1 + num2;
        String operation = String.format("%.2f + %.2f = %.2f", num1, num2, result);
        history.add(operation);
        return result;
    }

    // Perform subtraction and update history
    public double subtract(double num1, double num2) {
        double result = num1 - num2;
        String operation = String.format("%.2f - %.2f = %.2f", num1, num2, result);
        history.add(operation);
        return result;
    }

    // Perform multiplication and update history
    public double multiply(double num1, double num2) {
        double result = num1 * num2;
        String operation = String.format("%.2f * %.2f = %.2f", num1, num2, result);
        history.add(operation);
        return result;
    }

    // Perform division and update history
    public double divide(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Error: Division by zero");
            return 0; // Return 0 in case of division by zero
        }
        double result = num1 / num2;
        String operation = String.format("%.2f / %.2f = %.2f", num1, num2, result);
        history.add(operation);
        return result;
    }

    // Print history of operations
    public void printHistory() {
        System.out.println("Operations History:");
        for (String operation : history) {
            System.out.println(operation);
        }
    }
}

// Main class to run the calculator program
public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

        // Loop to keep the calculator running
        while (true) {
            // Display menu
            System.out.println("\nChoose an operation:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. View History");
            System.out.println("6. Exit");

            // Get user choice
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            double num1, num2, result;
            switch (choice) {
                case 1:
                    System.out.print("Enter first number: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    num2 = scanner.nextDouble();
                    result = calculator.add(num1, num2);
                    System.out.println("Result: " + result);
                    break;
                case 2:
                    System.out.print("Enter first number: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    num2 = scanner.nextDouble();
                    result = calculator.subtract(num1, num2);
                    System.out.println("Result: " + result);
                    break;
                case 3:
                    System.out.print("Enter first number: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    num2 = scanner.nextDouble();
                    result = calculator.multiply(num1, num2);
                    System.out.println("Result: " + result);
                    break;
                case 4:
                    System.out.print("Enter first number: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    num2 = scanner.nextDouble();
                    result = calculator.divide(num1, num2);
                    System.out.println("Result: " + result);
                    break;
                case 5:
                    calculator.printHistory();
                    break;
                case 6:
                    System.out.println("Exiting calculator. Goodbye!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please choose again.");
            }
        }
    }
}

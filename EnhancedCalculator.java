import java.util.Scanner;

public class EnhancedCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== Enhanced Calculator =====");
            System.out.println("1. Basic Arithmetic Operations");
            System.out.println("2. Scientific Calculations");
            System.out.println("3. Unit Conversions");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            
            choice = scanner.nextInt();

            switch(choice) {
                case 1:
                    basicArithmetic(scanner);
                    break;
                case 2:
                    scientificCalculations(scanner);
                    break;
                case 3:
                    unitConversions(scanner);
                    break;
                case 4:
                    System.out.println("Exiting the calculator. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 4);

        scanner.close();
    }

    // Basic Arithmetic Operations
    public static void basicArithmetic(Scanner scanner) {
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        System.out.println("\nChoose Operation:");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");
        System.out.print("Enter your choice: ");
        int operation = scanner.nextInt();

        switch (operation) {
            case 1:
                System.out.println("Result: " + (num1 + num2));
                break;
            case 2:
                System.out.println("Result: " + (num1 - num2));
                break;
            case 3:
                System.out.println("Result: " + (num1 * num2));
                break;
            case 4:
                if (num2 != 0)
                    System.out.println("Result: " + (num1 / num2));
                else
                    System.out.println("Error: Division by zero is not allowed.");
                break;
            default:
                System.out.println("Invalid operation selected.");
        }
    }

    // Scientific Calculations
    public static void scientificCalculations(Scanner scanner) {
        System.out.println("\nChoose Scientific Operation:");
        System.out.println("1. Square Root (√)");
        System.out.println("2. Exponentiation (^)");
        System.out.print("Enter your choice: ");
        int operation = scanner.nextInt();

        switch (operation) {
            case 1:
                System.out.print("Enter number: ");
                double num = scanner.nextDouble();
                if (num >= 0)
                    System.out.println("Square Root: " + Math.sqrt(num));
                else
                    System.out.println("Error: Cannot find square root of a negative number.");
                break;
            case 2:
                System.out.print("Enter base: ");
                double base = scanner.nextDouble();
                System.out.print("Enter exponent: ");
                double exponent = scanner.nextDouble();
                System.out.println("Result: " + Math.pow(base, exponent));
                break;
            default:
                System.out.println("Invalid scientific operation selected.");
        }
    }

    // Unit Conversions
    public static void unitConversions(Scanner scanner) {
        System.out.println("\nChoose Unit Conversion:");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.println("3. USD to INR");
        System.out.println("4. INR to USD");
        System.out.print("Enter your choice: ");
        int conversion = scanner.nextInt();

        switch (conversion) {
            case 1:
                System.out.print("Enter temperature in Celsius: ");
                double celsius = scanner.nextDouble();
                double fahrenheit = (celsius * 9/5) + 32;
                System.out.println("Temperature in Fahrenheit: " + fahrenheit);
                break;
            case 2:
                System.out.print("Enter temperature in Fahrenheit: ");
                fahrenheit = scanner.nextDouble();
                celsius = (fahrenheit - 32) * 5/9;
                System.out.println("Temperature in Celsius: " + celsius);
                break;
            case 3:
                System.out.print("Enter amount in USD: ");
                double usd = scanner.nextDouble();
                double inr = usd * 83.0;  // Assume 1 USD = 83 INR
                System.out.println("Amount in INR: " + inr);
                break;
            case 4:
                System.out.print("Enter amount in INR: ");
                inr = scanner.nextDouble();
                usd = inr / 83.0;
                System.out.println("Amount in USD: " + usd);
                break;
            default:
                System.out.println("Invalid conversion selected.");
        }
    }
}

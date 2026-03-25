import java.util.Scanner;
class Calculator {
    double add(double a, double b) {
        return a + b;
    }
    double subtract(double a, double b) {
        return a - b;
    }
    double multiply(double a, double b) {
        return a * b;
    }
    double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Cannot divide by zero!");
            return 0;
        }
        return a / b;
    }
    double power(double a, double b) {
        return Math.pow(a, b);
    }
    double modulus(double a, double b) {
        return a % b;
    }
}
public class AdvancedCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();
        int choice;
        double a, b, result;
        do {
            System.out.println("\n===== Advanced Calculator =====");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Power (a^b)");
            System.out.println("6. Modulus");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            if (choice >= 1 && choice <= 6) {
                try {
                    System.out.print("Enter first number: ");
                    a = sc.nextDouble();
                    System.out.print("Enter second number: ");
                    b = sc.nextDouble();
                    switch (choice) {
                        case 1:
                            result = calc.add(a, b);
                            break;
                        case 2:
                            result = calc.subtract(a, b);
                            break;
                        case 3:
                            result = calc.multiply(a, b);
                            break;
                        case 4:
                            result = calc.divide(a, b);
                            break;
                        case 5:
                            result = calc.power(a, b);
                            break;
                        case 6:
                            result = calc.modulus(a, b);
                            break;
                        default:
                            result = 0;
                    }
                    System.out.println("Result: " + result);
                } catch (Exception e) {
                    System.out.println("Invalid input! Please enter numbers only.");
                    sc.nextLine(); // clear buffer
                }
            } else if (choice == 7) {
                System.out.println("Calculator Closed.");
            } else {
                System.out.println("Invalid Choice!");
            }
        } while (choice != 7);
        sc.close();
    }
}
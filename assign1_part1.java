import java.util.Scanner;
import java.math.BigInteger;

public class Assignment1part1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            displayMenu();

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the position for Fibonacci sequence: ");
                    int fibPosition = scanner.nextInt();
                    System.out.println("Fibonacci at position " + fibPosition + ": " + fibonacci(fibPosition));
                    break;

                case 2:
                    System.out.print("Enter the number for factorial: ");
                    int num = scanner.nextInt();
                    System.out.println("Factorial of " + num + ": " + factorial(num));
                    break;

                case 3:
                    System.out.println("Exiting the program. Goodbye!");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }

    private static void displayMenu() {
        System.out.println("\nChoose an operation:");
        System.out.println("1. Fibonacci Sequence");
        System.out.println("2. Factorial");
        System.out.println("3. Exit");
        System.out.print("Enter your choice (1-3): ");
    }

    private static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    private static BigInteger factorial(int n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
}

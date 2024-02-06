import java.util.Scanner;

public class Calculator {
    public double add(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Cannot divide by zero!");
            return Double.NaN;
        }
    }

    public double squareRoot(double a) {
        if (a >= 0) {
            return Math.sqrt(a);
        } else {
            System.out.println("Cannot calculate square root of a negative number!");
            return Double.NaN;
        }
    }

    public double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    public double mean() {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        int count = 0;

        System.out.println("Enter numbers (type 'end' to finish):");

        while (true) {
            String input = scanner.next();

            if (input.equalsIgnoreCase("end")) {
                break;
            }

            try {
                double number = Double.parseDouble(input);
                sum += number;
                count++;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number or 'end' to finish.");
            }
        }

        if (count > 0) {
            return sum / count;
        } else {
            System.out.println("No valid numbers entered for mean calculation.");
            return Double.NaN;
        }
    }

    public double variance() {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        double sumSquares = 0;
        int count = 0;

        System.out.println("Enter numbers (type 'end' to finish):");

        while (true) {
            String input = scanner.next();

            if (input.equalsIgnoreCase("end")) {
                break;
            }

            try {
                double number = Double.parseDouble(input);
                sum += number;
                sumSquares += Math.pow(number, 2);
                count++;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number or 'end' to finish.");
            }
        }

        if (count > 1) {
            double mean = sum / count;
            return sumSquares / count - Math.pow(mean, 2);
        } else {
            System.out.println("Insufficient data for variance calculation (at least 2 values needed).");
            return Double.NaN;
        }
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nChoose an operation:");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Square Root");
            System.out.println("6. Power");
            System.out.println("7. Mean");
            System.out.println("8. Variance");
            System.out.println("9. Exit");

            System.out.print("Enter your choice (1-9): ");
            int choice = scanner.nextInt();

            double result;

            switch (choice) {
                case 1:
                    result = calculator.add(getOperand("first"), getOperand("second"));
                    break;
                case 2:
                    result = calculator.subtract(getOperand("first"), getOperand("second"));
                    break;
                case 3:
                    result = calculator.multiply(getOperand("first"), getOperand("second"));
                    break;
                case 4:
                    result = calculator.divide(getOperand("numerator"), getOperand("denominator"));
                    break;
                case 5:
                    result = calculator.squareRoot(getOperand("number"));
                    break;
                case 6:
                    result = calculator.power(getOperand("base"), getOperand("exponent"));
                    break;
                case 7:
                    result = calculator.mean();
                    break;
                case 8:
                    result = calculator.variance();
                    break;
                case 9:
                    System.out.println("Exiting the calculator. Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
                    continue;
            }

            System.out.println("Result: " + result);
        }
    }

    private static double getOperand(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter " + prompt + " operand: ");
        return scanner.nextDouble();
    }
}


public class RationalNumber {
	
	private int numerator;
    private int denominator;

    public RationalNumber(int numerator, int denominator) {
        if (denominator == 0)
            throw new IllegalArgumentException("Denominator cannot be zero.");
        this.numerator = numerator;
        this.denominator = denominator;
        simplify();
    }

    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    private void simplify() {
        int gcd = gcd(Math.abs(numerator), Math.abs(denominator));
        numerator /= gcd;
        denominator /= gcd;
    }

    public RationalNumber add(RationalNumber other) {
        int newNumerator = numerator * other.denominator + other.numerator * denominator;
        int newDenominator = denominator * other.denominator;
        return new RationalNumber(newNumerator, newDenominator);
    }

    public RationalNumber subtract(RationalNumber other) {
        int newNumerator = numerator * other.denominator - other.numerator * denominator;
        int newDenominator = denominator * other.denominator;
        return new RationalNumber(newNumerator, newDenominator);
    }

    public RationalNumber multiply(RationalNumber other) {
        int newNumerator = numerator * other.numerator;
        int newDenominator = denominator * other.denominator;
        return new RationalNumber(newNumerator, newDenominator);
    }

    public RationalNumber divide(RationalNumber other) {
        if (other.numerator == 0)
            throw new ArithmeticException("Cannot divide by zero.");
        int newNumerator = numerator * other.denominator;
        int newDenominator = denominator * other.numerator;
        return new RationalNumber(newNumerator, newDenominator);
    }

    public double toDouble() {
        return (double) numerator / denominator;
    }

    public RationalNumber abs() {
        return new RationalNumber(Math.abs(numerator), Math.abs(denominator));
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }

}

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter first rational number (in the form a/b): ");
            String[] num1 = scanner.nextLine().split("/");
            int a = Integer.parseInt(num1[0]);
            int b = Integer.parseInt(num1[1]);
            RationalNumber rational1 = new RationalNumber(a, b);

            System.out.print("Enter second rational number (in the form a/b): ");
            String[] num2 = scanner.nextLine().split("/");
            int c = Integer.parseInt(num2[0]);
            int d = Integer.parseInt(num2[1]);
            RationalNumber rational2 = new RationalNumber(c, d);

            System.out.println("Addition: " + rational1.add(rational2));
            System.out.println("Subtraction: " + rational1.subtract(rational2));
            System.out.println("Multiplication: " + rational1.multiply(rational2));
            System.out.println("Division: " + rational1.divide(rational2));
            System.out.println("Comparison: " + (rational1.toDouble() == rational2.toDouble() ? "Equal" : "Not Equal"));
            System.out.println("Absolute value of first number: " + rational1.abs());
            System.out.println("Absolute value of second number: " + rational2.abs());
        } catch (NumberFormatException e) {
            System.out.println("Invalid input format. Please enter integers separated by '/'.");
        } catch (IllegalArgumentException | ArithmeticException e) {
            System.out.println(e.getMessage());
        }

	}

}

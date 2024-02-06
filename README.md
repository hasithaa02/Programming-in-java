# Programming-in-java

## Assignment 1 Part 1:
1.Implement a menu-driven Java program (like fib or factorial) to implement these input methods in java (command line args,
Scanner, BufferedReader, DataInputStream, Console)

### Code Execution Flow:
The program starts by initializing a Scanner.
It enters an infinite loop, displaying a menu and waiting for user input.
Depending on the user's choice, it either calculates the Fibonacci sequence, factorial, or exits the program.
The fibonacci and factorial methods perform the respective calculations.
The program continues to run until the user chooses to exit.

### Definitions:

Scanner: A class in Java that provides methods for reading input from various sources, such as the console.
BigInteger: A class in Java that provides arbitrary-precision integers. It is used for handling large factorials.

### fibonacci method:

Calculates the Fibonacci sequence value at a given position using recursion.
Base case: If n is 0 or 1, returns n.
Recursive case: Calls itself with n-1 and n-2, summing the results.

### factorial method:
Calculates the factorial of a given number using BigInteger to handle large results.
Initializes a BigInteger variable result to 1.
Uses a loop to multiply result by each integer from 2 to the given number.

## Assignment 1 Part 2
2.Implement a simple menu driven calculator in java to implement add, sub, multiplication, div, sqrt, power, mean, variance. Implement a separate Calculator class to include all related function inside that class. (Mean calculation: program reads numbers from the keyboard, summing them in the process until the user enters the string "end". It then stops input & displays the avg. of numbers)
### Code Execution Flow:
The program starts by creating an instance of the Calculator class and a Scanner.
It enters an infinite loop displaying a menu and waiting for user input.
Depending on the user's choice, it calls the corresponding method from the Calculator class.
The program continues to run until the user chooses to exit.

### Definitions:

Scanner: A class in Java that provides methods for reading input from various sources, such as the console.
Double.NaN: A constant representing "Not a Number," used to indicate undefined or unrepresentable results in floating-point calculations.

### Basic Mathematical Operations Methods:
add(double a, double b): Returns the sum of two numbers.
subtract(double a, double b): Returns the result of subtracting the second number from the first.
multiply(double a, double b): Returns the product of two numbers.
divide(double a, double b): Returns the result of dividing the first number by the second. Handles division by zero and returns Double.NaN in such cases.

### Advanced Mathematical Operations Methods:
squareRoot(double a): Returns the square root of a number. Handles negative input and returns Double.NaN for such cases.
power(double base, double exponent): Returns the result of raising the base to the specified exponent.

### Statistical Operations Methods:
mean(): Prompts the user to enter numbers until they type "end", calculates and returns the mean (average) of the entered numbers.
variance(): Prompts the user to enter numbers until they type "end", calculates and returns the variance of the entered numbers.

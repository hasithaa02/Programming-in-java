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

## Assignment 2 Part 1
Write
a Java program that declares two arrays named 'even' and 'odd'.
Accept numbers from the user and move them to respective arrays depending
on whether they are even or odd.
### Description
The program takes user input to determine the size of an array. It then prompts the user to enter numbers, categorizing them as even or odd and storing them in separate arrays. Finally, it displays the even and odd numbers stored in their respective arrays. The program utilizes the Scanner class for user input.

## Assignment 2 Part 2
 Implement a Java method  that
finds two neighboring numbers in an array with the smallest distance to
each. The function should return the index of the 1st number.

### Description
The program defines a method named findNearestNeighborIndex, which takes an array of integers as input and returns the index of the first number with the smallest distance to its neighboring number. The main method of the program takes user input to determine the size of the array, prompts the user to enter array elements, and then calls the findNearestNeighborIndex method to find and display the index of the nearest neighbor with the smallest distance. The program utilizes the Scanner class for user input and includes checks for null arrays or arrays with less than two elements.

## Assignment 2 Part 3
Write a Java program to convert an array into ArrayList and
vice versa.

### Description
The program takes user input to determine the size of a string array. It then prompts the user to enter string elements for the array. After that, it converts the array to an ArrayList using Arrays.asList() and initializes an ArrayList named fruitList. The program then prints the conversion from Array to ArrayList. Subsequently, it converts the ArrayList back to an array using the toArray method and prints the resulting array. The program utilizes the Scanner class for user input and demonstrates the conversion between arrays and ArrayLists.
## Assignment 3
Write a  menu-driven Java Program to study the concepts of classes, and array of
objects/arraylist, instance members, and constructors in Java. Assignment description:
Create a Student class describing attributes of a student like prn, name, DoB, marks etc.
Create an array of objects of Student class and perform operations like Add students, Display,
Search. (by prn, by name, by position), Update/Edit and Delete.

### Description
This Java code implements a Student Management System using a Student class and a main class. The Student class represents a student with attributes like PRN, name, DoB, and marks. The main class, StudentManagementSystem, uses an ArrayList to manage student records, providing a menu-driven interface for users to add, display, search, update, or delete student information. Input validation is implemented, and the program runs in a loop until the user chooses to exit, ensuring a user-friendly experience for managing student data through console input.
Methods:
add student: Takes user input to add a new student to the ArrayList. Handles input exceptions.
displayStudents: Displays the details of all students in the ArrayList.
searchStudents: Provides a submenu for searching students by PRN or name.
searchByPRN and searchByName: Search for students based on PRN or name, respectively.
updateStudent: Updates the marks of a student based on PRN.
deleteStudent: Deletes a student based on PRN.

## Assignment 5 part 1

Part 1 - Implement the generic Shapes class as an interface s so that we can implement concrete classes like circle, triangle, rectangle class from it.

### Description
The code defines a Java program that models geometric shapes using an interface Shape and implements it in three classes: Circle, Triangle, and Rectangle. The Assignment5_Part1 class serves as the main class to demonstrate the functionality of these shapes by calculating and displaying their areas and perimeters.
### Methods:

Shape Interface:

calculateArea(): Calculates the area of the shape.
calculatePerimeter(): Calculates the perimeter of the shape.
Circle Class:

calculateArea(): Computes the area of the circle using the formula πr².
calculatePerimeter(): Computes the perimeter of the circle using the formula 2πr.
Triangle Class:

calculateArea(): Implements area calculation for a triangle using Heron's formula.
calculatePerimeter(): Computes the perimeter of the triangle by summing its sides.
Rectangle Class:

calculateArea(): Computes the area of the rectangle using the formula length × width.
calculatePerimeter(): Computes the perimeter of the rectangle using the formula 2(length + width).
## Assignment 5 part 2
Part2 :  Implement Employee as an abstract and derive 2 classes such as NormalEmployee and BonusEmployee from it and perform the salary calculations based on the formulas  as per the excel attachment

### description
This Java code defines a simplified payroll system with an abstract class Employee and two subclasses, NormalEmployee and BonusEmployee. The PaySlip class demonstrates how to use these classes by creating instances and printing pay slips.

### Methods:

Getter and Setter methods: Access and modify attributes.
theMonthly() method: Abstract method for monthly salary calculation.
Other methods: Calculate and set various attributes like basic wage, HRA, deductions, and net salary.
Methods in NormalEmployee and BonusEmployee classes:

theMonthly() method: Overrides the base class method to calculate monthly salary. BonusEmployee additionally calculates a bonus salary.
Methods in PaySlip class:

main() method: Demonstrates the payroll system by creating instances, setting attributes, calculating monthly salary, and printing pay slips.
printPaySlip() method: Prints the pay slip, displaying details like earnings, deductions, and net salary.

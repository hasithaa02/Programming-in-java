import java.util.ArrayList;
import java.util.Scanner;
class Student {
int prn;
String name;
String dob;
double marks;
// Constructor to initialize the Student object
public Student(int prn, String name, String dob, double marks) {
this.prn = prn;
this.name = name;
this.dob = dob;
this.marks = marks;
}
// Display method to print student details
public void display() {
System.out.println(&quot;PRN: &quot; + prn + &quot;\tName: &quot; + name + &quot;\tDoB: &quot; +
dob + &quot;\tMarks: &quot; + marks);
}
}
public class StudentManagementSystem {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
ArrayList&lt;Student&gt; studentList = new ArrayList&lt;&gt;();
int choice;
do {
System.out.println(&quot;\n**** Student Management System ****&quot;);
System.out.println(&quot;1. Add Student&quot;);
System.out.println(&quot;2. Display Students&quot;);
System.out.println(&quot;3. Search Students&quot;);
System.out.println(&quot;4. Update/Edit Student&quot;);
System.out.println(&quot;5. Delete Student&quot;);
System.out.println(&quot;6. Exit&quot;);
System.out.print(&quot;Enter your choice: &quot;);
choice = scanner.nextInt();
switch (choice) {
case 1:
addStudent(scanner, studentList);
break;
case 2:
displayStudents(studentList);
break;
case 3:
searchStudents(scanner, studentList);
break;

case 4:
updateStudent(scanner, studentList);
break;
case 5:
deleteStudent(scanner, studentList);
break;
case 6:
System.out.println(&quot;Exiting the program. Goodbye!&quot;);
break;
default:
System.out.println(&quot;Invalid choice. Please enter a
valid option.&quot;);
}
} while (choice != 6);
scanner.close();
}
private static void addStudent(Scanner scanner, ArrayList&lt;Student&gt;
studentList) {
try {
System.out.print(&quot;Enter PRN: &quot;);
int prn = scanner.nextInt();
scanner.nextLine(); // Consume the newline character
System.out.print(&quot;Enter Name: &quot;);
String name = scanner.nextLine();
System.out.print(&quot;Enter Date of Birth (DoB): &quot;);
String dob = scanner.nextLine();
System.out.print(&quot;Enter Marks: &quot;);
double marks = scanner.nextDouble();
Student student = new Student(prn, name, dob, marks);
studentList.add(student);
System.out.println(&quot;Student added successfully!&quot;);
} catch (java.util.InputMismatchException e) {
System.out.println(&quot;Invalid input. Please enter a valid PRN and
Marks.&quot;);
scanner.nextLine(); // Consume the invalid input
}
}
private static void displayStudents(ArrayList&lt;Student&gt; studentList) {
System.out.println(&quot;\n**** List of Students ****&quot;);
for (int i = 0; i &lt; studentList.size(); i++) {
System.out.print(&quot;Position: &quot; + (i + 1) + &quot;\t&quot;);
studentList.get(i).display();
}
}
private static void searchStudents(Scanner scanner, ArrayList&lt;Student&gt;
studentList) {
System.out.println(&quot;\n**** Search Students ****&quot;);
System.out.println(&quot;1. Search by PRN&quot;);
System.out.println(&quot;2. Search by Name&quot;);
System.out.print(&quot;Enter your choice: &quot;);
int searchChoice = scanner.nextInt();
switch (searchChoice) {

case 1:
searchByPRN(scanner, studentList);
break;
case 2:
searchByName(scanner, studentList);
break;
default:
System.out.println(&quot;Invalid choice. Please enter a valid
option.&quot;);
}
}
private static void searchByPRN(Scanner scanner, ArrayList&lt;Student&gt;
studentList) {
System.out.print(&quot;Enter PRN to search: &quot;);
int searchPRN = scanner.nextInt();
boolean found = false;
for (Student student : studentList) {
if (student.prn == searchPRN) {
student.display();
found = true;
break;
}
}
if (!found) {
System.out.println(&quot;Student with PRN &quot; + searchPRN + &quot; not
found.&quot;);
}
}
private static void searchByName(Scanner scanner, ArrayList&lt;Student&gt;
studentList) {
scanner.nextLine(); // Consume the newline character
System.out.print(&quot;Enter Name to search: &quot;);
String searchName = scanner.nextLine();
boolean found = false;
for (Student student : studentList) {
if (student.name.equalsIgnoreCase(searchName)) {
student.display();
found = true;
break;
}
}
if (!found) {
System.out.println(&quot;Student with Name &#39;&quot; + searchName + &quot;&#39; not
found.&quot;);
}
}
private static void updateStudent(Scanner scanner, ArrayList&lt;Student&gt;
studentList) {
System.out.print(&quot;Enter PRN to update: &quot;);
int updatePRN = scanner.nextInt();
boolean found = false;
for (int i = 0; i &lt; studentList.size(); i++) {
Student student = studentList.get(i);

if (student.prn == updatePRN) {
System.out.print(&quot;Enter new Marks: &quot;);
double newMarks = scanner.nextDouble();
studentList.get(i).marks = newMarks;
System.out.println(&quot;Student updated successfully!&quot;);
found = true;
break;
}
}
if (!found) {
System.out.println(&quot;Student with PRN &quot; + updatePRN + &quot; not
found.&quot;);
}
}
private static void deleteStudent(Scanner scanner, ArrayList&lt;Student&gt;
studentList) {
System.out.print(&quot;Enter PRN to delete: &quot;);
int deletePRN = scanner.nextInt();
boolean found = false;
for (int i = 0; i &lt; studentList.size(); i++) {
Student student = studentList.get(i);
if (student.prn == deletePRN) {
studentList.remove(i);
System.out.println(&quot;Student deleted successfully!&quot;);
found = true;
break;
}
}
if (!found) {
System.out.println(&quot;Student with PRN &quot; + deletePRN + &quot; not
found.&quot;);
}
}
}

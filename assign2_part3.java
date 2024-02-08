
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Assignment2part3{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        String[] array = new String[n];
        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < n; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = scanner.next();
        }

        List<String> arrayListFromArray = Arrays.asList(array);
        ArrayList<String> fruitList = new ArrayList<>(arrayListFromArray);

        System.out.println("Converting Array to ArrayList:");
        System.out.println(fruitList);

        String[] item = fruitList.toArray(new String[fruitList.size()]);

        System.out.println("Converting ArrayList to Array:");
        for (String s : item) {
            System.out.println(s);
        }

        scanner.close();
    }
}


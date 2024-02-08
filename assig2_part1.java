import java.util.Scanner;

public class assignment2part1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] even;
        int[] odd;

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        even = new int[size];
        odd = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            int num = scanner.nextInt();

            if (num % 2 == 0) {
                even[i] = num;
            } else {
                odd[i] = num;
            }
        }

        System.out.print("\nEven numbers: ");
        for (int i = 0; i < size; i++) {
            if (even[i] != 0) {
                System.out.print(even[i] + " ");
            }
        }

        System.out.print("\nOdd numbers: ");
        for (int i = 0; i < size; i++) {
            if (odd[i] != 0) {
                System.out.print(odd[i] + " ");
            }
        }

        scanner.close();
    }
}

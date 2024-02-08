import java.util.Scanner;

public class Assignment2part2 {
    public static int findNearestNeighborIndex(int[] array) {
        if (array == null || array.length < 2) {
            return -1;
        }

        int minDistance = Integer.MAX_VALUE;
        int nearestNeighborIndex = -1;

        for (int i = 0; i < array.length - 1; i++) {
            int currentDistance = Math.abs(array[i] - array[i + 1]);

            if (currentDistance < minDistance) {
                minDistance = currentDistance;
                nearestNeighborIndex = i;
            }
        }

        return nearestNeighborIndex;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] numbers = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        int index = findNearestNeighborIndex(numbers);

        if (index != -1) {
            System.out.println("The index of the first number with the smallest distance to its neighbor is: " + index);
        } else {
            System.out.println("Array is null or has less than two elements.");
        }

        scanner.close();
    }
}

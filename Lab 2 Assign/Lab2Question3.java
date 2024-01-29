import java.util.Scanner;

public class LAb2Question3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int sizeOfArray = scanner.nextInt();

        int[] myArray = new int[sizeOfArray];

        System.out.print("Enter the total elements present in the array: ");
        int totalElements = scanner.nextInt();

        if (totalElements > sizeOfArray || totalElements < 0) {
            System.out.println("Invalid total elements. Must be between 0 and " + sizeOfArray);
            return;
        }

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < totalElements; i++) {
            System.out.print("Enter element at index " + i + ": ");
            myArray[i] = scanner.nextInt();
        }

        System.out.println("Original array:");
        displayArray(myArray, totalElements);

        System.out.print("Enter the index position for deletion: ");
        int loc = scanner.nextInt();

        if (loc >= 0 && loc < totalElements) {
            for (int i = loc; i < totalElements - 1; i++) {
                myArray[i] = myArray[i + 1];
            }
            totalElements--;

            System.out.println("Array after deletion:");
            displayArray(myArray, totalElements);
        } else {
            System.out.println("Invalid index position for deletion.");
        }

        scanner.close();
    }

    private static void displayArray(int[] array, int totalElements) {
        for (int i = 0; i < totalElements; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}

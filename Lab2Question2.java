import java.util.Scanner;

public class Lab2Question2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int sizeOfArray = scanner.nextInt();

        int[] myArray = new int[sizeOfArray];

        System.out.println("Enter the elements of the array in random order:");
        for (int i = 0; i < sizeOfArray; i++) {
            System.out.print("Enter element at index " + i + ": ");
            myArray[i] = scanner.nextInt();
        }

        System.out.println("Original array:");
        displayArray(myArray);

        System.out.print("Enter the position for insertion: ");
        int position = scanner.nextInt();

        System.out.print("Enter the element to be inserted: ");
        int element = scanner.nextInt();

        if (position >= 0 && position <= sizeOfArray) {
            for (int i = sizeOfArray - 1; i > position; i--) {
                myArray[i] = myArray[i - 1];
            }
            myArray[position] = element;

            System.out.println("Array after insertion:");
            displayArray(myArray);
        } else {
            System.out.println("Invalid position for insertion.");
        }

        scanner.close();
    }

    private static void displayArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}

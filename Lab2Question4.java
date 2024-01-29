import java.util.Scanner;

public class Lab2Question4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int sizeOfArray = scanner.nextInt();

        int[] myArray = new int[sizeOfArray];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < sizeOfArray; i++) {
            System.out.print("Enter element at index " + i + ": ");
            myArray[i] = scanner.nextInt();
        }

        System.out.println("Array elements:");
        displayArray(myArray);

        System.out.print("Enter the element to be searched: ");
        int element = scanner.nextInt();

        int position = searchElement(myArray, element);

        if (position != -1) {
            System.out.println("Element found at index " + position);
        } else {
            System.out.println("Element not found in the array");
        }

        scanner.close();
    }

    private static void displayArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    private static int searchElement(int[] array, int element) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                return i; 
            }
        }
        return -1; 
    }
}

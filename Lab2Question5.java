import java.util.Scanner;

public class Lab2Question5 {

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

        System.out.println("Array elements:");
        displayArray(myArray);

        findAndPrintDuplicates(myArray);

        scanner.close();
    }

    private static void displayArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    private static void findAndPrintDuplicates(int[] array) {
        int n = array.length;

        for (int i = 0; i < n; i++) {
            int index = Math.abs(array[i]) % n;
            array[index] += n;
        }

        System.out.println("Duplicate elements and their frequency of occurrence:");

        for (int i = 0; i < n; i++) {
            if (array[i] >= n * 2) {
                System.out.println("Element " + i + ": Frequency " + array[i] / n);
            }
        }
    }
}

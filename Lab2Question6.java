import java.util.Scanner;

public class Lab2Question6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int sizeOfArray = scanner.nextInt();

        int[] originalArray = new int[sizeOfArray];

        System.out.println("Enter the elements of the array in random order:");
        for (int i = 0; i < sizeOfArray; i++) {
            System.out.print("Enter element at index " + i + ": ");
            originalArray[i] = scanner.nextInt();
        }

        System.out.println("Original array elements:");
        displayArray(originalArray);

        int[] evenArray = getEvenNumbers(originalArray);
        int[] oddArray = getOddNumbers(originalArray);

        System.out.println("Even array elements:");
        displayArray(evenArray);

        System.out.println("Odd array elements:");
        displayArray(oddArray);

        scanner.close();
    }

    private static void displayArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    private static int[] getEvenNumbers(int[] array) {
        int evenCount = 0;
        for (int value : array) {
            if (value % 2 == 0) {
                evenCount++;
            }
        }

        int[] evenArray = new int[evenCount];
        int index = 0;
        for (int value : array) {
            if (value % 2 == 0) {
                evenArray[index++] = value;
            }
        }
        return evenArray;
    }

    private static int[] getOddNumbers(int[] array) {
        int oddCount = 0;
        for (int value : array) {
            if (value % 2 != 0) {
                oddCount++;
            }
        }

        int[] oddArray = new int[oddCount];
        int index = 0;
        for (int value : array) {
            if (value % 2 != 0) {
                oddArray[index++] = value;
            }
        }
        return oddArray;
    }
}

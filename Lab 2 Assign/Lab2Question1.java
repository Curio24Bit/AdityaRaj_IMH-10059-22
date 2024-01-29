import java.util.Scanner;

public class Lab2Question1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int sizeOfArray = sc.nextInt();

        int[] myArray = new int[sizeOfArray];

        System.out.println("Enter the elements of the array in random order:");
        for (int i = 0; i < sizeOfArray; i++) {
            System.out.print("Enter element at index " + i + ": ");
            myArray[i] = sc.nextInt();
        }

        System.out.println("The elements of the array are:");
        for (int i = 0; i < sizeOfArray; i++) {
            System.out.println("Element at index " + i + ": " + myArray[i]);
        }

        int numberOfElements = myArray.length;
        System.out.println("Total number of elements in the array: " + numberOfElements);

        sc.close();
    }
}

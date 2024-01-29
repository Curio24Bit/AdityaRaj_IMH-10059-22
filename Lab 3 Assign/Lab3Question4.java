import java.util.Scanner;

public class Lab3Question4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        String lowercaseString = convertToLowerCase(inputString);
        System.out.println("String in lowercase: " + lowercaseString);

        displayStringLength(inputString);

        scanner.close();
    }

    private static String convertToLowerCase(String str) {
        return str.toLowerCase();
    }

    private static void displayStringLength(String str) {
        System.out.println("Total length of the string: " + str.length());
    }
}

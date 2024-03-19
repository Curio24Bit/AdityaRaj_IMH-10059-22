import java.util.Scanner;

public class Main7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();
        scanner.close();
        checkAlphabet(userInput.toLowerCase());
    }

    public static void checkAlphabet(String input) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder missingChars = new StringBuilder();

        for (char ch : alphabet.toCharArray()) {
            if (input.indexOf(ch) == -1) {
                missingChars.append(ch);
            }
        }

        if (missingChars.length() == 0) {
            System.out.println("All characters from the alphabet are present in the string.");
        } else {
            System.out.println("Missing characters: " + missingChars.toString());
        }
    }
}

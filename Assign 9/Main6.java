import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string with leading zeros:");
        String input = scanner.nextLine();

        String result = remove(input);

        System.out.println("String after removing leading zeros: " + result);

        scanner.close();
    }

    public static String remove(String str) {
        int nonZeroIndex = 0;
        while (nonZeroIndex < str.length() && str.charAt(nonZeroIndex) == '0') {
            nonZeroIndex++;
        }
        return str.substring(nonZeroIndex);
    }
}

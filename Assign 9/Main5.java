import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter a string:");
        String input = s.nextLine();

        String reversed = reverseString(input);

        System.out.println("Reversed string: " + reversed);

        s.close();
    }

    public static String reverseString(String str) {
        
        char[] charArray = str.toCharArray();
        int left = 0;
        int right = charArray.length - 1;
        while (left < right) { 
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
            left++;
            right--;
        }
        return new String(charArray);
    }
}
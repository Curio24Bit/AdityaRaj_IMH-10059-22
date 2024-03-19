import java.util.*;

public class Main_4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a String");
        String S1 = s.nextLine().toLowerCase();
        System.out.println("Enter another String");
        String S2 = s.nextLine().toLowerCase();

        if (S1.length() != S2.length()) {
            System.out.println("Not Anagrams");
        } else {
            char[] charArray1 = S1.toCharArray();
            char[] charArray2 = S2.toCharArray();
            Arrays.sort(charArray1);
            Arrays.sort(charArray2);

            if (Arrays.equals(charArray1, charArray2)) {
                System.out.println("Anagrams");
            } else {
                System.out.println("Not Anagrams");
            }
        }

        s.close();
    }
}


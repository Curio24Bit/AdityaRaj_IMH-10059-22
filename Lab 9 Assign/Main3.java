import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        ArrayList<Integer> list1 = new ArrayList<>();
        System.out.println("Enter integers for the first list (enter any non-integer to stop):");
        while (s.hasNextInt()) {
            list1.add(s.nextInt());
        }
        Scanner s2 = new Scanner(System.in);

        ArrayList<Integer> list2 = new ArrayList<>();
        System.out.println("Enter integers for the second list (enter any non-integer to stop):");
        while (s2.hasNextInt()) {
            list2.add(s2.nextInt());
        }

        System.out.println("Comparing the two lists:");
        if (list1.equals(list2)) {
            System.out.println("The lists are equal.");
        } else {
            System.out.println("The lists are not equal.");
        }

        ArrayList<Integer> joinedList = new ArrayList<>(list1);
        joinedList.addAll(list2);
        System.out.println("Joined list:");
        System.out.println(joinedList);

        int m1 = Collections.max(joinedList);
        System.out.println("Maximum Element in List: " + m1);

        int m2 = Collections.min(joinedList);
        System.out.println("Minimum Element in List: " + m2);
        
        System.out.println("Enter a value to remove:");
        int rem = s.nextInt();
        joinedList.remove(Integer.valueOf(rem));
        System.out.println("After removing 200:");
        System.out.println(joinedList);
        
        s.close();
        s2.close();
    }
}

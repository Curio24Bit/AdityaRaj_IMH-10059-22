import java.util.ArrayList;
import java.util.Scanner;

public class Main2 {
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

        System.out.println("Enter a value to search:");
        int valueToSearch = s.nextInt();
        if (joinedList.contains(valueToSearch)) {
            System.out.println("The value is present in one of the lists.");
        } else {
            System.out.println("The value is not present in any of the lists.");
        }

        s.close();
        s2.close();
    }
}

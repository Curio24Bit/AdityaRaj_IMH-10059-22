import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer>L = new ArrayList<>();
        System.out.println("Enter integers (enter any non-integer to stop):");
        while (scanner.hasNextInt()) {
            L.add(scanner.nextInt());
        }
        L.add(0, 100); 
        L.add(200);
        L.add(300);

        System.out.println("Integer ArrayList:");
        System.out.println(L);

        L.remove(Integer.valueOf(200));
        System.out.println("After removing 200:");
        System.out.println(L);
        
        Collections.sort(L);
        System.out.println("After sorting:");
        System.out.println(L);

        ArrayList<String> stringL = new ArrayList<>();
        System.out.println("Enter strings (enter 'stop' to stop):");
        while (true) {
            String input = scanner.next();
            if (input.equals("stop")) {
                break;
            }
            stringL.add(input);
        }

        stringL.add(0, "Hello");
        stringL.add("World");
        stringL.add("!");

        System.out.println("String ArrayList:");
        System.out.println(stringL);

        stringL.remove("World");
        System.out.println("After removing 'World':");
        System.out.println(stringL);

        Collections.sort(stringL);
        System.out.println("After sorting:");
        System.out.println(stringL);

        scanner.close();
    }
}
import java.util.Scanner;

public class Lab3Question2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        if (validateUser(name)) {
            System.out.println("Name is valid.");
        } else {
            System.out.println("Invalid name. Name should contain only alphabets.");
        }

        if (validateUser(age)) {
            System.out.println("Age is valid.");
        } else {
            System.out.println("Invalid age. Age should be greater than 3 and less than 15.");
        }

        scanner.close();
    }

    private static boolean validateUser(String name) {
        return name.matches("[a-zA-Z]+");
    }

    private static boolean validateUser(int age) {
        return age > 3 && age < 15;
    }
}

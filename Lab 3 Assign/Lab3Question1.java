import java.util.Scanner;

public class Lab2Question1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select a shape:");
        System.out.println("1. Rectangle");
        System.out.println("2. Circle");
        System.out.println("3. Square");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter length of the rectangle: ");
                double length = scanner.nextDouble();
                System.out.print("Enter width of the rectangle: ");
                double width = scanner.nextDouble();

                System.out.println("Area of rectangle: " + calculateArea(length, width));
                System.out.println("Perimeter of rectangle: " + calculatePerimeter(length, width));
                break;

            case 2:
                System.out.print("Enter radius of the circle: ");
                double radius = scanner.nextDouble();

                System.out.println("Area of circle: " + calculateArea(radius));
                System.out.println("Circumference of circle: " + calculateCircumference(radius));
                break;

            case 3:
                System.out.print("Enter side length of the square: ");
                double sideLength = scanner.nextDouble();

                System.out.println("Area of square: " + calculateArea(sideLength));
                System.out.println("Perimeter of square: " + calculatePerimeter(sideLength));
                break;

            default:
                System.out.println("Invalid choice.");
        }

        scanner.close();
    }

    private static double calculateArea(double length, double width) {
        return length * width;
    }

    private static double calculatePerimeter(double length, double width) {
        return 2 * (length + width);
    }

    private static double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    private static double calculateCircumference(double radius) {
        return 2 * Math.PI * radius;
    }

    private static double calculateArea(double sideLength) {
        return sideLength * sideLength;
    }

    private static double calculatePerimeter(double sideLength) {
        return 4 * sideLength;
    }
}

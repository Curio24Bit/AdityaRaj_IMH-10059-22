import java.util.Scanner;

public class AreaCalculator {
    private double length;
    private double breadth;
    private double side;

    public AreaCalculator(double... dimensions) {
        if (dimensions.length == 1) {
            this.side = dimensions[0];
        } else if (dimensions.length == 2) {
            this.length = dimensions[0];
            this.breadth = dimensions[1];
        } else {
            this.length = 0;
            this.breadth = 0;
            this.side = 0;
        }
    }

    public void calculateRectangleArea(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
        double area = length * breadth;
        System.out.println("Area of Rectangle: " + area);
    }

    public void calculateSquareArea(double side) {
        this.side = side;
        double area = side * side;
        System.out.println("Area of Square: " + area);
    }

    public void displayDetails() {
        System.out.println("Length: " + length);
        System.out.println("Breadth: " + breadth);
        System.out.println("Side: " + side);
    }

    public void setDimensionsFromUser() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Length: ");
        this.length = scanner.nextDouble();

        System.out.print("Enter Breadth: ");
        this.breadth = scanner.nextDouble();

        System.out.print("Enter Side: ");
        this.side = scanner.nextDouble();
    }

    public static void main(String[] args) {
        AreaCalculator shape1 = new AreaCalculator();
        shape1.setDimensionsFromUser();
        shape1.calculateRectangleArea(shape1.length, shape1.breadth);
        shape1.calculateSquareArea(shape1.side);
        shape1.displayDetails();
        System.out.println();
    }


}

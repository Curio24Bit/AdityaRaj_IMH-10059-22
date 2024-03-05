class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    public double circumference() {
        return perimeter();
    }
}

class Cylinder extends Circle {
    private double height;

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public double volume() {
        return area() * height;
    }
}

public class Main2 {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(7,9); 
        System.out.println("Area of the cylinder: " + cylinder.area());
        System.out.println("Volume of the cylinder: " + cylinder.volume());
    }
}

import java.util.*;

class rectangle1 {
    public int length;
    public int breadth;

    public rectangle1() {
        this.length = 1;
        this.breadth = 1;
    }

    public rectangle1(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }
}

class Cuboid extends rectangle1 {
    public int height;

    public Cuboid() {
        this.height = 1;
    }

    public Cuboid(int length, int breadth, int height) {
        super(length, breadth);
        this.height = height;
    }

    int getvolume() {
        return length * breadth * height;
    }
}

public class Main3 {
    public static void main(String[] args) {
        Cuboid C = new Cuboid();
        System.out.println("Volume of default cuboid: " + C.getvolume());

        Cuboid customCuboid = new Cuboid(1, 3, 6);
        System.out.println("Volume of custom cuboid: " + customCuboid.getvolume());
    }
}
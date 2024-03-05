import java.util.*;

class shape1{
    public double getarea(){
        return 0;
    }   
}

class rectangle2 extends shape1{
    public double length;
    public double width;
    
    public rectangle2(double length,double width){
        this.length= length;
        this.width=width;
    }
    
    public double getarea(){
        return length*width;
    }
}

class box1 extends rectangle2{
    private double height;
    
    public box1(double length, double width, double height){
        super(length,width);
        this.height=height;
    }
    
    public double getarea(){
        return 2*(super.getarea()+ length*height + width*height);
    }
    
}

public class Main4 {
    public static void main(String[] args) {
        shape1 shape = new shape1();
        System.out.println("Area of the shape: " + shape.getarea());

        rectangle2 rectangle = new rectangle2(5, 3);
        System.out.println("Area of the rectangle: " + rectangle.getarea());

        box1 box = new box1(2, 3, 4);
        System.out.println("Surface area of the box: " + box.getarea());
    }
}
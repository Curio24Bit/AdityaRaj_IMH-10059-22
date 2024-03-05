import java.util.*;

class shape{
    public double getarea(){
        return 0;
    }   
}

class rectangle extends shape{
    public double length;
    public double width;
    
    public rectangle(double length,double width){
        this.length= length;
        this.width=width;
    }
    
    public double getarea(){
        return length*width;
    }
}

class box extends rectangle{
    private double height;
    
    public box(double length, double width, double height){
        super(length,width);
        this.height=height;
    }
    
    public double getarea(){
        return 2*(super.getarea()+ length*height + width*height);
    }
    
}

public class Main {
    public static void main(String[] args){
        shape s=new shape();
        System.out.println(s.getarea());
        rectangle rec=new rectangle(3,6);
        System.out.println(rec.getarea());
        box b=new box(2,3,5);
        System.out.println(b.getarea());    
        
    }
    
}

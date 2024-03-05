class Base {
    public void display() {
        System.out.println("Inside Base class - display() method");
    }
}

class Derived extends Base {
    public void show() {
        System.out.println("Inside Derived class - show() method");
    }
}

public class Main5 {
    public static void main(String[] args) {
        Base ref1 = new Base(); 
        Base ref2 = new Derived(); 

        ref1.display();

        if (ref2 instanceof Derived) {
            Derived dObj = (Derived) ref2; 
            dObj.show();
        }
    }
}
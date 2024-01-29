public class Lab2Question6 {

    public static void main(String[] args) {
        TypePromotionDemo demo = new TypePromotionDemo();

        demo.displayValue(10);        
        demo.displayValue(25.5f);     
        demo.displayValue(35L);       
        demo.displayValue("Hello");   


    }

    private void displayValue(int x) {
        System.out.println("Method with int parameter: " + x);
    }

    private void displayValue(float x) {
        System.out.println("Method with float parameter: " + x);
    }

    private void displayValue(long x) {
        System.out.println("Method with long parameter: " + x);
    }

    private void displayValue(String str) {
        System.out.println("Method with String parameter: " + str);
    }
}

public class Student {
    private int studentRoll;
    private String studentName;
    private double[] studentMarks;

    public Student(int roll, String name, double[] marks) {
        this.studentRoll = roll;
        this.studentName = (name != null && !name.isEmpty()) ? name : "Unknown";
        this.studentMarks = (marks != null) ? marks : new double[5]; 
    }

    public Student() {
        this.studentRoll = 0;
        this.studentName = "Unknown";
        this.studentMarks = new double[5];
    }

    public int getStudentRoll() {
        return this.studentRoll;
    }

    public String getStudentName() {
        return this.studentName;
    }

    public double[] getStudentMarks() {
        return this.studentMarks;
    }

    public void printStudentDetails() {
        System.out.println("Student Roll: " + this.studentRoll);
        System.out.println("Student Name: " + this.studentName);
        System.out.println("Student Marks: " + java.util.Arrays.toString(this.studentMarks));
    }

    public static void main(String[] args) {
   
        Student student1 = new Student(101, "James", new double[]{85, 90, 78, 92, 88});
        student1.printStudentDetails();

        System.out.println();
        Student student2 = new Student();
        student2.printStudentDetails();
    }
}
class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Student extends Person {
    int roll;
    int marks;

    public Student(String name, int age, int roll, int marks) {
        super(name, age);
        this.roll = roll;
        this.marks = marks;
    }

    // Method hiding
    static void display(Student student) {
        System.out.println("Student Name: " + student.name);
        System.out.println("Student Age: " + student.age);
        System.out.println("Roll: " + student.roll);
        System.out.println("Marks: " + student.marks);
    }
}

class Employee extends Person {
    int salary;

    public Employee(String name, int age, int salary) {
        super(name, age);
        this.salary = salary;
    }

    // Dynamic method dispatch
    void display() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Age: " + age);
        System.out.println("Salary: " + salary);
    }

    // Shadowing
    void display(String message) {
        System.out.println(message);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Age: " + age);
        System.out.println("Salary: " + salary);
    }
}

public class Main6 {
    public static void main(String[] args) {
        Person person = new Person("John", 30);
        person.display();

        Student student = new Student("Alice", 20, 101, 90);
        Student.display(student); 

        Person studentPerson = new Student("Bob", 22, 102, 85);
        studentPerson.display(); 

        Employee employee = new Employee("Emma", 35, 50000);
        employee.display(); 

        employee.display("Welcome,");
    }
}

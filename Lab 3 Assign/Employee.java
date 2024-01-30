import java.util.Scanner;

public class Employee {
    private int employee_id;
    private String employee_name;
    private String employee_department;

    public Employee() {
        this.employee_id = 0;
        this.employee_name = "";
        this.employee_department = "";
    }
    public Employee(int id, String name, String department) {
        this.employee_id = id;
        this.employee_name = name;
        this.employee_department = department;
    }
    public void setEmployeeId(int id) {
        this.employee_id = id;
    }

    public void setEmployeeName(String name) {
        this.employee_name = name;
    }

    public void setEmployeeDepartment(String department) {
        this.employee_department = department;
    }

    public int getEmployeeId() {
        return this.employee_id;
    }

    public String getEmployeeName() {
        return this.employee_name;
    }

    public String getEmployeeDepartment() {
        return this.employee_department;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        int id = scanner.nextInt();

        System.out.print("Enter Employee Name: ");
        scanner.nextLine();
        String name = scanner.nextLine();

        System.out.print("Enter Employee Department: ");
        String department = scanner.nextLine();

        Employee emp = new Employee(id, name, department);

        System.out.println("Employee ID: " + emp.getEmployeeId());
        System.out.println("Employee Name: " + emp.getEmployeeName());
        System.out.println("Employee Department: " + emp.getEmployeeDepartment());
        
        scanner.close();
    }
}

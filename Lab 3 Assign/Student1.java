public class Student1 {
    private static int totalStudents = 3;
    private String[] studentNames;
    private int[][] studentMarks;

    public Student1(String[] names, int[][] marks) {
        if (names.length == totalStudents && marks.length == totalStudents) {
            this.studentNames = names;
            this.studentMarks = marks;
        } else {
            System.out.println("Wrong number of students provided.");
        }
    }

    public void calculateAverageMarks() {
        for (int i = 0; i < totalStudents; i++) {
            int sum = 0;
            for (int j = 0; j < studentMarks[i].length; j++) {
                sum += studentMarks[i][j];
            }
            double average = (double) sum / studentMarks[i].length;
            System.out.println("Average marks for " + studentNames[i] + ": " + average);
        }
    }

    public static void main(String[] args) {
      
        String[] names = {"Student1", "Student2", "Student3"};
        int[][] marks = {{80, 75, 90, 85, 88}, {70, 85, 92, 78, 80}, {85, 88, 95, 90, 82}};

        Student1 studentObj = new Student1(names, marks);
        studentObj.calculateAverageMarks();
    }
}

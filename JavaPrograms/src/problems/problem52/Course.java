package problems.problem52;

public class Course {
    private String courseName;
    private String enrolledStudents;
    public static int maxCapacity;

    public void enrollStudent(String studentName) {
        enrolledStudents = studentName;
        System.out.println("Student enrolled successfully.");
    }

    public void unEnrollStudent(String studentName) {
        if (studentName.equals(enrolledStudents)) {
            enrolledStudents = "";
            System.out.println("Student un enroll successfully.");
        } else {
            System.out.println("Student is not enrolled.");
        }
    }

    public static void setMaxCapacity(int capacity) {
        maxCapacity = capacity;
    }
}

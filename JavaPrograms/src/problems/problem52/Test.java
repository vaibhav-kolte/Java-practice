package problems.problem52;

public class Test {
    public static void main(String[] args) {
        System.out.println("Welcome to course enroll system.");

        Course.setMaxCapacity(60);
        Course course = new Course();
        course.enrollStudent("Vaibhav");
        course.enrollStudent("Sharad");
        course.unEnrollStudent("Pankaj");
        course.unEnrollStudent("Sharad");

    }
}

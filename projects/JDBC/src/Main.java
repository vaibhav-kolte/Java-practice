import org.jetbrains.annotations.NotNull;

import java.sql.*;
import java.util.Scanner;

public class Main {

    private static final String URL = "jdbc:mysql://localhost:3306/learn_jdbc_db";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "mysql";

    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("ClassNotFoundException: " + e.getException());
        }

        try {
            Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            Statement statement = connection.createStatement();
            performOperation(statement);

        } catch (SQLException e) {
            System.out.println("SQLException: " + e.getMessage());
        }
    }

    private static void performOperation(Statement statement) throws SQLException {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Insert student");
            System.out.println("2. Display student record");
            System.out.println("3. Update student");
            System.out.println("4. Delete student");
            System.out.println("5. Exit");
            System.out.print("Select operation: ");
            int operation = scanner.nextInt();
            switch (operation) {
                case 1 -> insertData(statement, scanner);
                case 2 -> showData(statement);
                case 3 -> updateStudents(statement, scanner);
                case 4 -> deleteStudent(statement, scanner);
                case 5 -> System.exit(0);
            }
            System.out.println();
        }
    }

    private static void deleteStudent(@NotNull Statement statement, @NotNull Scanner scanner)
            throws SQLException {

        System.out.print("Enter id: ");
        int id = scanner.nextInt();

        String query = String.format("DELETE FROM students WHERE id = %d", id);
        int rowAffected = statement.executeUpdate(query);
        if (rowAffected > 0) {
            System.out.println("Student deleted.");
        } else {
            System.out.println("Student not deleted.");
        }

    }

    private static void updateStudents(@NotNull Statement statement, @NotNull Scanner scanner)
            throws SQLException {

        System.out.print("Enter marks: ");
        double marks = scanner.nextDouble();
        System.out.print("Enter id: ");
        int id = scanner.nextInt();

        String query = String.format("UPDATE students SET marks = %f WHERE id = %d",
                marks, id);
        int rowAffected = statement.executeUpdate(query);
        if (rowAffected > 0) {
            System.out.println("Record update.");
        } else {
            System.out.println("Record not update.");
        }
    }

    private static void insertData(@NotNull Statement statement, @NotNull Scanner scanner)
            throws SQLException {
        System.out.print("Enter name: ");
        String name = scanner.next();
        System.out.print("Enter age: ");
        int age = scanner.nextInt();
        System.out.print("Enter marks: ");
        double marks = scanner.nextDouble();

        String query = String.format("INSERT INTO students(name, age, marks) VALUES('%s', %d, %f)",
                name.trim(), age, marks);
        int rowAffected = statement.executeUpdate(query);
        if (rowAffected > 0) {
            System.out.println("Record inserted.");
        } else {
            System.out.println("Record not inserted.");
        }
    }

    public static void showData(@NotNull Statement statement) throws SQLException {
        String query = "select * from students";
        ResultSet resultSet = statement.executeQuery(query);
        System.out.println("-------------------- Students -------------------------");
        while (resultSet.next()) {
            System.out.println("ID: " + resultSet.getInt("id"));
            System.out.println("NAME: " + resultSet.getString("name"));
            System.out.println("AGE: " + resultSet.getInt("age"));
            System.out.println("MARKS: " + resultSet.getString("marks"));
            System.out.println("---------------------------------------------");
        }

    }
}
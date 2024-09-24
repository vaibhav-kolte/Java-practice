import org.jetbrains.annotations.NotNull;

import java.sql.*;
import java.util.Scanner;

public class JdbcStudentCrud {
    private final String URL = "jdbc:mysql://localhost:3306/learn_jdbc_db";
    private final String USERNAME = "root";
    private final String PASSWORD = "mysql";

    public JdbcStudentCrud() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("ClassNotFoundException: " + e.getException());
        }

    }
    public void start(){
        try {
            Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            Statement statement = connection.createStatement();
            performOperation(connection, statement);

        } catch (SQLException e) {
            System.out.println("SQLException: " + e.getMessage());
        }
    }


    private void performOperation(Connection connection, Statement statement) throws SQLException {
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
                case 1 -> {
//                    insertData(statement, scanner);
//                    insertData(connection, scanner);
//                    insertDataUsingBatch(connection, scanner);
                    insertDataUsingBatchPrepared(connection, scanner);
                }
                case 2 -> {
                    showData(statement);
//                    showMarks(connection, scanner);
                }
                case 3 -> {
//                    updateStudents(statement, scanner);
                    updateStudents(connection, scanner);
                }
                case 4 -> {
//                    deleteStudent(statement, scanner);
                    deleteStudent(connection, scanner);
                }
                case 5 -> {
                    return;
                }
            }
            System.out.println();
        }
    }

    private void deleteStudent(@NotNull Connection connection, @NotNull Scanner scanner)
            throws SQLException {
        System.out.print("Enter id: ");
        int id = scanner.nextInt();

        String query = "DELETE FROM students WHERE id = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setInt(1, id);
        int rowAffected = preparedStatement.executeUpdate();
        if (rowAffected > 0) {
            System.out.println("Student deleted.");
        } else {
            System.out.println("Student not deleted.");
        }

    }

    private void deleteStudent(@NotNull Statement statement, @NotNull Scanner scanner)
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

    private void updateStudents(@NotNull Statement statement, @NotNull Scanner scanner)
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

    private void updateStudents(@NotNull Connection connection, @NotNull Scanner scanner)
            throws SQLException {
        System.out.print("Enter marks: ");
        double marks = scanner.nextDouble();
        System.out.print("Enter id: ");
        int id = scanner.nextInt();

        String query = "UPDATE students SET marks = ? WHERE id = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setDouble(1, marks);
        preparedStatement.setInt(2, id);

        int rowAffected = preparedStatement.executeUpdate();
        if (rowAffected > 0) {
            System.out.println("Record update.");
        } else {
            System.out.println("Record not update.");
        }
    }

    // Insert data using statement
    private void insertData(@NotNull Statement statement, @NotNull Scanner scanner)
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

    // Insert data using prepared statement
    private void insertData(@NotNull Connection connection, @NotNull Scanner scanner)
            throws SQLException {
        System.out.print("Enter name: ");
        String name = scanner.next();
        System.out.print("Enter age: ");
        int age = scanner.nextInt();
        System.out.print("Enter marks: ");
        double marks = scanner.nextDouble();

        String query = "INSERT INTO students(name, age, marks) VALUES(?, ?, ?)";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, name);
        preparedStatement.setInt(2, age);
        preparedStatement.setDouble(3, marks);

        int rowAffected = preparedStatement.executeUpdate();
        if (rowAffected > 0) {
            System.out.println("Record inserted.");
        } else {
            System.out.println("Record not inserted.");
        }
    }

    // Insert data using statement and batch
    private void insertDataUsingBatch(@NotNull Connection connection, @NotNull Scanner scanner)
            throws SQLException {
        Statement statements = connection.createStatement();
        while (true) {
            System.out.print("Enter name: ");
            String name = scanner.next();
            System.out.print("Enter age: ");
            int age = scanner.nextInt();
            System.out.print("Enter marks: ");
            double marks = scanner.nextDouble();
            String query = String.format("INSERT INTO students(name, age, marks) VALUES('%s', %d, %f)",
                    name.trim(), age, marks);
            statements.addBatch(query);
            System.out.print("Enter more student (Y/N): ");
            String choice = scanner.next();
            if (choice.equalsIgnoreCase("N")) break;
        }
        int[] rowsAffectedArrays = statements.executeBatch();
        int failure = 0;
        for (int rowsAffectedArray : rowsAffectedArrays) {
            if (rowsAffectedArray == 0) {
                System.out.println("Record inserted failed");
                failure++;
            }
        }
        if (failure == 0) {
            System.out.println("All record inserted successfully.");
        }
    }


    // Insert data using prepared statement and batch
    private void insertDataUsingBatchPrepared(@NotNull Connection connection, @NotNull Scanner scanner)
            throws SQLException {
        String query = "INSERT INTO students(name, age, marks) VALUES(?, ?, ?)";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        while (true) {
            System.out.print("Enter name: ");
            String name = scanner.next();
            System.out.print("Enter age: ");
            int age = scanner.nextInt();
            System.out.print("Enter marks: ");
            double marks = scanner.nextDouble();
            preparedStatement.setString(1, name);
            preparedStatement.setInt(2, age);
            preparedStatement.setDouble(3, marks);
            preparedStatement.addBatch();
            System.out.print("Enter more student (Y/N): ");
            String choice = scanner.next();
            if (choice.equalsIgnoreCase("N")) break;
        }
        int[] rowsAffectedArrays = preparedStatement.executeBatch();
        int failure = 0;
        for (int rowsAffectedArray : rowsAffectedArrays) {
            if (rowsAffectedArray == 0) {
                System.out.println("Record inserted failed");
                failure++;
            }
        }
        if (failure == 0) {
            System.out.println("All record inserted successfully.");
        }
    }

    // Show data using statement
    private void showData(@NotNull Statement statement)
            throws SQLException {
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

    // Retrieve data using PreparedStatement
    private void showMarks(@NotNull Connection connection, @NotNull Scanner scanner)
            throws SQLException {
        System.out.print("Enter id: ");
        int id = scanner.nextInt();

        String query = "SELECT marks FROM students WHERE id = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setInt(1, id);

        ResultSet resultSet = preparedStatement.executeQuery();
        if (resultSet.next()) {
            System.out.println("MARKS: " + resultSet.getDouble("marks"));
        } else {
            System.out.println("Marks not found with id = " + id);
        }
    }
}

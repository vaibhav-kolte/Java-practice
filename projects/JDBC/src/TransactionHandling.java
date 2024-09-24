import java.sql.*;
import java.util.Scanner;

public class TransactionHandling {

    private static final String URL = "jdbc:mysql://localhost:3306/lenden";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "mysql";
    private Connection connection;

    public TransactionHandling() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("ClassNotFoundException: " + e.getException());
        }

        try {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);

        } catch (SQLException e) {
            System.out.println("SQLException: " + e.getMessage());
        }
    }


    public void handleTransaction() {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Debit account number: ");
            int debitAccountNumber = scanner.nextInt();
            System.out.print("Enter transfer amount: ");
            double transferBalance = scanner.nextDouble();
            System.out.print("Credit account number: ");
            int creditAccountNumber = scanner.nextInt();


            connection.setAutoCommit(false);

            String debit_query = "UPDATE accounts SET balance = balance - ? WHERE account_number = ?";
            String credit_query = "UPDATE accounts SET balance = balance + ? WHERE account_number = ?";

            PreparedStatement debitPreparedStatement = connection.prepareStatement(debit_query);
            PreparedStatement creditPreparedStatement = connection.prepareStatement(credit_query);


            debitPreparedStatement.setDouble(1, transferBalance);
            debitPreparedStatement.setInt(2, debitAccountNumber);

            creditPreparedStatement.setDouble(1, transferBalance);
            creditPreparedStatement.setInt(2, creditAccountNumber);

            if (isSufficientBalance(transferBalance, debitAccountNumber)) {
                int debitAffectedRows = debitPreparedStatement.executeUpdate();
                int creditAffectedRows = creditPreparedStatement.executeUpdate();
                connection.commit();
            } else {
                connection.rollback();
                System.out.println("Insufficient balance.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    private boolean isSufficientBalance(double transferBalance, int accountNumber) throws SQLException {
        String query = "SELECT balance FROM accounts WHERE account_number = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setInt(1, accountNumber);

        ResultSet resultSet = preparedStatement.executeQuery();
        if (resultSet.next()) {
            System.out.println(resultSet.getDouble("balance"));
            return resultSet.getDouble("balance") >= transferBalance;
        }
        return false;
    }
}

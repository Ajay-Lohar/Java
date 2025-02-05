package preparedStatementDemo;

import java.sql.*;
import java.util.Scanner;

import static com.itshaala.Constants.*;

public class Demo2 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //ask employee for the id and will return the data
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your employee id");
        int employeeId = scanner.nextInt();

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);

        String query = "select * from employees where employee_id=?";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setInt(1, employeeId);
        ResultSet resultSet = preparedStatement.executeQuery();

        while (resultSet.next()) {
            System.out.println(resultSet.getInt("employee_id") + "\t" +
                    resultSet.getString("first_name") + "\t" +
                    resultSet.getString("last_name") + "\t" +
                    resultSet.getString("email") + "\t" +
                    resultSet.getString("phone_number") + "\t" +
                    resultSet.getDate("hire_date") + "\t" +
                    resultSet.getString("job_id") + "\t" +
                    resultSet.getFloat("salary") + "\t" +
                    resultSet.getFloat("commission_pct") + "\t" +
                    resultSet.getInt("manager_id") + "\t" +
                    resultSet.getInt("department_id") + "\t"
            );
        }
        connection.close();


    }
}

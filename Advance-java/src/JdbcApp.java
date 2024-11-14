import java.sql.*;

public class JdbcApp {
        public static void main(String[] args) throws ClassNotFoundException, SQLException {
            // step 1 : add the connector jar to the project

            //step 2 : load and register the Driver with DriverManager
            Class.forName("com.mysql.cj.jdbc.Driver");

            //step 3: get the connection
            String url = "jdbc:mysql://localhost:3306/college";
            String username = "root";
            String password = "root";
            Connection connection = DriverManager.getConnection(url, username, password);

            //step 4: execute the query
            String query = "select * from student";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            //step 5: get the result

            System.out.println("Id"+"\t"+"F_Name"+"\t"+"L_Name"+"\t"+"Email");
            while (resultSet.next()) {
                System.out.println(resultSet.getInt("student_id")+ "\t"+
                        resultSet.getString("student_fname") + "\t"+
                        resultSet.getString("student_lname") + "\t"+
                        resultSet.getString("student_email") + "\t"
                );
            }
            //step 6: close the connection
            connection.close();
        }
    }


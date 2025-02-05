package com.itshaala.otherOperations;

import com.itshaala.model.Student;
import com.itshaala.util.ConnectionUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Demo2MetaData {
    public static void main(String[] args) {
        // metadata - data about data
        //resultsetMetaData will get extra information regarding the resultset
        // no. of columns, type column
        String query = "select e.employee_id, e.first_name, d.department_name from hr.employees e inner join hr.departments d on e.department_id = d.department_id";
        Connection connection = ConnectionUtil.getConnection();
        try {
            Statement preparedStatement = connection.createStatement();
            ResultSet resultSet = preparedStatement.executeQuery(query);
            ResultSetMetaData resultSetMetaData = resultSet.getMetaData();
            System.out.println("Total number of columns " + resultSetMetaData.getColumnCount());
            System.out.println("Table name " + resultSetMetaData.getTableName(1));
            System.out.println("Column name " + resultSetMetaData.getColumnName(3));
            System.out.println("Is Column Auto Increment " + resultSetMetaData.isAutoIncrement(1));


        } catch (SQLException e) {
            System.out.println("issue in compiling the query");
        }
    }
}

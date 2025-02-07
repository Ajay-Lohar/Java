package com.ajay.springboot7jdbccrud.dao;


import com.ajay.springboot7jdbccrud.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class Dao {

    @Autowired
    private JdbcTemplate jdbcTemplate;


    public boolean insertUser(User user) {

    boolean status=false;

        try {
            String Inseret_Sql_Query ="insert into users values(?,?,?,?)";
            int count =jdbcTemplate.update(Inseret_Sql_Query ,user.getName(),user.getEmail(),user.getGender(),user.getCity());
            if (count>0){
                status=true;
            }else {
                status=false;
            }

        } catch (Exception e) {
            status=false;
            e.printStackTrace();
        }
        return status;
    }

    public boolean updateUser(User user) {

        boolean status=false;

        try {
            String Update_Sql_Query="update users set name=?, gender=?, city=? where email=?";
            int count = jdbcTemplate.update(Update_Sql_Query,user.getName(),user.getGender(),user.getCity(),user.getEmail());

            if (count>0){
                status=true;
            }else {
                status=false;
            }

        } catch (Exception e) {
            status=false;
            e.printStackTrace();
        }
        return status;
    }

    public boolean deleteUserByEmail(String email) {

        boolean status=false;

        try {
            String Update_Sql_Query="delete from users where email=?";
            int count = jdbcTemplate.update(Update_Sql_Query,email);

            if (count>0){
                status=true;
            }else {
                status=false;
            }

        } catch (Exception e) {
            status=false;
            e.printStackTrace();
        }
        return status;
    }

    public User getUserByEmail(String email) {
        String Select_Sql_Query="select * from users where email=?";
        return  jdbcTemplate.queryForObject(Select_Sql_Query,new UserRowMapper(),email);
    }

    public List<User> getAllUsers() {
        String Select_sql_qury="select * from users";
        return jdbcTemplate.query(Select_sql_qury, new UserRowMapper());
    }




    public static final class UserRowMapper implements RowMapper<User> {
        @Override
        public User mapRow(ResultSet rs, int rowNum) throws SQLException {

            User user = new User();
            user.setName(rs.getString("name"));
            user.setEmail(rs.getString("email"));
            user.setGender(rs.getString("gender"));
            user.setCity(rs.getString("city"));

            return user;
        }
    }

}

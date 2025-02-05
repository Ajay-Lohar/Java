package com.itshaala;

import com.itshaala.dao.UserDao;
import com.itshaala.model.User;

import java.util.List;

public class UserApp {
    public static void main(String[] args) {
        UserDao userDao = new UserDao();
        /*User user = new User(2, "Akshay", List.of("HR", "FACILITY"));
        userDao.addUser(user);
        System.out.println(userDao.getUserById(1));*/
        userDao.findAllUsersLikeName("Onkar").forEach(System.out::println);
    }
}

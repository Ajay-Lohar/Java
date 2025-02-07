package com.ajay.springboot7jdbccrud;

import com.ajay.springboot7jdbccrud.dao.Dao;
import com.ajay.springboot7jdbccrud.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class SpringBoot7JdbcCrudApplication implements CommandLineRunner {

    @Autowired
    private Dao dao;

    public static void main(String[] args) {
        SpringApplication.run(SpringBoot7JdbcCrudApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        // -----------------------Insertion--------------------------
//        User user1 = new User("Ashish","khandekara@gmail.com","male","Ujalaiwadi");
//       boolean status = dao.insertUser(user1);
//
//       if (status){
//           System.out.println("Inserted user Successfully");
//       }else {
//           System.out.println("Insertion Failed");
//       }

        //-----------------------Updation 1----------------------------
//
//        User user1 = new User("Ashish","khandekara@gmail.com","male","Kolhapur");
//        boolean status = dao.updateUser(user1);
//
//        if (status){
//           System.out.println("Updation user Successfully");
//         }else {
//          System.out.println("Updation Failed");
//        }
       //-----------------------Updation 2----------------------------
//
        User user = dao.getUserByEmail("khandekara@gmail.com");
        user.setCity("Delhi");
        boolean status = dao.updateUser(user);

        if (status){
           System.out.println("Updation user Successfully");
         }else {
          System.out.println("Updation Failed");
        }

        //----------------------Delation----------------------------

//       boolean status = dao.deleteUserByEmail("deshmukhjayraj18@gmail.com");
//       if (status) {
//           System.out.println("User deleted successfully");
//       }
//       else {
//           System.out.println("User could not be deleted");
//       }

        //--------------------Select one user-----------------------
//        User user = dao.getUserByEmail("loharajay998@gmail.com");
//        System.out.println("Name  :- "+user.getName());
//        System.out.println("Email :- "+user.getEmail());
//        System.out.println("Gender:- "+user.getGender());
//        System.out.println("city  :- "+user.getCity());

        //-----------------Select All User List -----------------------

//        List<User> list = dao.getAllUsers();
//        for (User user : list) {
//            System.out.println("Name  :- "+user.getName());
//            System.out.println("Email :- "+user.getEmail());
//            System.out.println("Gender:- "+user.getGender());
//            System.out.println("city  :- "+user.getCity());
//            System.out.println("----------------------------");
//        }

   }
}

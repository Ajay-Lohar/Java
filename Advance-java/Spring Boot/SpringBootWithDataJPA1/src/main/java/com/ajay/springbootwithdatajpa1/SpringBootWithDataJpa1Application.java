package com.ajay.springbootwithdatajpa1;

import com.ajay.springbootwithdatajpa1.entities.Student;
import com.ajay.springbootwithdatajpa1.services.StudentService;
import com.ajay.springbootwithdatajpa1.services.StudentServiceIMPL;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class SpringBootWithDataJpa1Application {

    public static void main(String[] args) {
      ApplicationContext context= SpringApplication.run(SpringBootWithDataJpa1Application.class, args);
      StudentService stdService = context.getBean(StudentServiceIMPL.class);

// ----------------Insert Operation ----------------------------------------------
//        Student std = new Student();
//        std.setName("Shraddha");
//        std.setRollno(31);
//        std.setMarks(95.3f);
//        boolean status = stdService.addStudentDetails(std);
//        if (status) {
//            System.out.println("Student added successfully");
//        }
//        else {
//            System.out.println("Student not added due to some error");
//        }

// -----------------------Select Operation All Data-------------------------------------
//        List<Student>stdList = stdService.getAllStudentDetails();
//        for (Student std : stdList) {
//            System.out.println("ID " +std.getId());
//            System.out.println("Name " +std.getName());
//            System.out.println("Roll No  " +std.getRollno());
//            System.out.println("Marks " +std.getMarks());
//            System.out.println("----------------------------------------");
//        }

// ----------------------Select Operation By Id ---------------------------------------
//             Student std= stdService.getStudentDetails(4l);
//            if (std!=null){
//                System.out.println("ID " +std.getId());
//                System.out.println("Name " +std.getName());
//                System.out.println("Roll No  " +std.getRollno());
//                System.out.println("Marks " +std.getMarks());
//            }else {
//                System.out.println("No student found");
//            }
// --------------------- Update Operation ---------------------------------------------
//        boolean status = stdService.updateStudentDetails(1l,98.4f);
//        if (status) {
//            System.out.println("Student details updated Successfully");
//        }else {
//            System.out.println("Student details not updated due to some error");
//        }

        //----------------Delete Operation ----------------------------------------
        boolean status = stdService.deleteStudentDetails(1l);
        if (status) {
            System.out.println("Student details deleted Successfully");
        }else {
            System.out.println("Student details not deleted due to some error");
        }

    }

}

import controller.CourseController;
import model.Course;

import java.sql.SQLException;

public class CourseApp{
    public static void main(String[] args) throws SQLException {
        CourseController courseController = new CourseController();

        //Create course
//        Course course = Course.builder()
//                .id(6)
//                .name("cyber Security ")
//                .description("real time Project")
//                .duration("4 months")
//                .fees(1)
//                .build();
//
//        courseController.addCourse(course);

        //edit course
//        Course course = Course.builder()
//                .id(1)
//                .name("Data Analytics")
//                .description("Prediction Project")
//                .duration("4 months")
//                .fees(40000)
//                .build();
//
//        courseController.editCourse(course);

        //delete course
//        courseController.deleteCourse(1);

        // getById
//        System.out.println("get by id");
//        System.out.println(courseController.getCourseById(1));

        //get All Course
//        System.out.println("all courses");
       courseController.getAllCourses().forEach(System.out::println);
    }
}
package _5_classComponents.methods.courseApp;

public class App {
    public static void main(String[] args) {
        CourseController courseController = new CourseController();
        courseController.createCourse();
        courseController.updateCourse();
        courseController.deleteCourse();
        courseController.readCourse();
    }
}

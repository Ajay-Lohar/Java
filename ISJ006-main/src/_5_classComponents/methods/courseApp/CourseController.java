package _5_classComponents.methods.courseApp;

public class CourseController {
    CourseService courseService = new CourseService();

    void createCourse() {
        courseService.createCourse();
    }

    void updateCourse() {
        courseService.updateCourse();
    }

    void deleteCourse() {
        courseService.deleteCourse();
    }

    void readCourse() {
        courseService.readCourse();
    }
}

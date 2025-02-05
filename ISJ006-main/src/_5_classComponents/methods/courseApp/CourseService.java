package _5_classComponents.methods.courseApp;

public class CourseService {
    CourseDao courseDao = new CourseDao();

    void createCourse() {
        courseDao.createCourse();
    }

    void updateCourse() {
        courseDao.updateCourse();
    }

    void deleteCourse() {
        courseDao.deleteCourse();
    }

    void readCourse() {
        courseDao.readCourse();
    }
}

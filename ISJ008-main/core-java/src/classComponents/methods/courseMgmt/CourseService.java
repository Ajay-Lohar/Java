package classComponents.methods.courseMgmt;

public class CourseService {
    CourseDao courseDao = new CourseDao();

    public void addCourse() {
        courseDao.addCourse();
    }

    public void updateCourse() {
        courseDao.updateCourse();
    }

    public void deleteCourse() {
        courseDao.deleteCourse();
    }

    public void getCourse() {
        courseDao.getCourse();
    }
}

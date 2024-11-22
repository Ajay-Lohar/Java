package service;

import dao.CourseDao;
import model.Course;

import java.sql.SQLException;
import java.util.List;

public class CourseService {

    CourseDao courseDao = new CourseDao();

    public void addCourse(Course course) throws SQLException {
        courseDao.addCourse(course);
    }

    public void editCourse(Course course) {
        courseDao.editCourse(course);
    }

    public void deleteCourse(int courseId) {
        courseDao.deleteCourse(courseId);
    }

    public Course getCourseById(int courseId) {
        return courseDao.getCourseById(courseId);
    }

    public List<Course> getAllCourses() {
        return courseDao.getAllCourses();
    }
}
package classComponents.methods.courseMgmt;

public class CourseController {
    CourseService courseService = new CourseService();
    public void addCourse(){
        courseService.addCourse();
    }
    public void updateCourse(){
        courseService.updateCourse();
    }
    public void deleteCourse(){
        courseService.deleteCourse();
    }
    public void getCourse(){
        courseService.getCourse();
    }
}

package _5_classComponents.constructors;

public class Course {
    int courseId;
    String courseName;
    int coursePrice;

    // zero param -> no args constructor
    public Course() {
    }

    //param --> all args constructor
    public Course(int courseId, String courseName, int coursePrice) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.coursePrice = coursePrice;
    }

    public static void main(String[] args) {
        Course course = new Course(1, "Fullstack Java", 100);
        System.out.println("Course ID : " + course.courseId);
        System.out.println("Course Name : " + course.courseName);
        System.out.println("Course Price : " + course.coursePrice);
    }
}

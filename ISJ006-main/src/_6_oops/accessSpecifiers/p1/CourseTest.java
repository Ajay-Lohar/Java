package _6_oops.accessSpecifiers.p1;

public class CourseTest {
    public static void main(String[] args) {
        Course course = new Course(1, "Java", 100, "core, ad");
        /*System.out.println(course.courseId);
        System.out.println(course.courseName);
        System.out.println(course.coursePrice);
        System.out.println(course.courseContent);*/

        course.setCourseId(100);
        course.setCourseName("Java Fullstack");
        course.setCoursePrice(37000);
        course.setCourseContent("Core java advance java frameworks");

        System.out.println(course.getCourseId());
        System.out.println(course.getCourseName());
        System.out.println(course.getCoursePrice());
        System.out.println(course.getCourseContent());
    }
}

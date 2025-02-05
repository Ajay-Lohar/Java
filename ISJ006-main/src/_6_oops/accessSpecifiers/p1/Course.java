package _6_oops.accessSpecifiers.p1;

public class Course {
    private int courseId;
    private String courseName;
    private int coursePrice;
    private String courseContent;

    public int getCourseId(){
        return courseId;
    }
    public String getCourseName(){
        return courseName;
    }
    public int getCoursePrice(){
        return coursePrice;
    }
    public String getCourseContent(){
        return courseContent;
    }

    public void setCourseId(int courseId){
        this.courseId = courseId;
    }
    public void setCourseName(String courseName){
        this.courseName = courseName;
    }

    public void setCoursePrice(int coursePrice){
        this.coursePrice= coursePrice;
    }

    public void setCourseContent(String courseContent){
        this.courseContent= courseContent;
    }

    public Course(int courseId, String courseName, int coursePrice, String courseContent) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.coursePrice = coursePrice;
        this.courseContent = courseContent;
    }

    public static void main(String[] args) {
        Course course = new Course(1, "Java", 100, "core, ad");
        System.out.println(course.courseId);
        System.out.println(course.courseName);
        System.out.println(course.coursePrice);
        System.out.println(course.courseContent);
    }
}

package misc.enumDemos;

public class Demo1 {
    public static void main(String[] args) {
        enum Days {
            Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;
            Days(){
                System.out.println("con");
            }
        }
        enum Courses {
            FULLSTACK_JAVA, FULLSTACK_PYTHON, DATA_SCIENCE, DATA_ANALYTICS, DEV_OPS, MERN, MEAN
        }
        System.out.println(Days.Monday);
        System.out.println(Days.Tuesday);
        System.out.println(Courses.FULLSTACK_JAVA);
        System.out.println(Courses.FULLSTACK_PYTHON);
    }
}

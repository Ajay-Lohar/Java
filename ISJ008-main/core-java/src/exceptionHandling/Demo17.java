package exceptionHandling;

public class Demo17 {
    public static void main(String[] args) {
        //Person person = new Person();
        try {
            Class.forName("exceptionHandling.Person12233");
        } catch (ClassNotFoundException classNotFoundException) {
            System.out.println("invalid class name");
        }
        System.out.println("rest of main ");
    }
}

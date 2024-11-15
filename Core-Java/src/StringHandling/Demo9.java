package StringHandling;

public class Demo9 {
    public static void main(String[] args) {
        String firstName = "Ajay";
        String fName  = "ajay";

        System.out.println(firstName == fName);// false : by reference check
        System.out.println(firstName.equals(fName));// false: content check with case
        System.out.println(firstName.equalsIgnoreCase(fName));//true --> content check ignoring case
        System.out.println(firstName.compareTo(fName));//int --> positive
    }
}

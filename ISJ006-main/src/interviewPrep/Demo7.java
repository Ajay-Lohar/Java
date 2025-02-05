package interviewPrep;

public class Demo7 {
    public static void main(String[] args) {
        for (int index = 1; index < 20; index++) {
            if (index % 2 == 0) {
                return;
            }
            System.out.println(index);
        }
        System.out.println("rest of the main method");
    }
}

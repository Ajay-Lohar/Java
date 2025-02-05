package interviewPrep;

public class Demo6 {
    public static void main(String[] args) {
        for (int index = 0; index < 20; index++) {
            if (index % 2 == 0) {
                continue;
            }
            System.out.println(index);
        }
    }
}

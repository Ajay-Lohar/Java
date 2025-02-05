package interviewPrep;

public class Demo9 {
    public static void main(String[] args) {
        int number = 100;
        //factors
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                System.out.println("factor " + i);
            }
        }


    }
}

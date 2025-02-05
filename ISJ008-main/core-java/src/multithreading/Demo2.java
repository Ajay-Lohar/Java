package multithreading;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class Demo2 {
    public static void main(String[] args) {
        long sum = 0L;
        long startTime = System.currentTimeMillis();
        for (long i = 1; i <= 50000000000l; i++) {
            sum += i;
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Sum is " + sum);
        System.out.println("Time taken to complete the job " + (endTime - startTime));
    }
}

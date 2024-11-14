package ClassComponants.Methods;

import java.util.Scanner;

public class Demo2 {
    public static boolean even(int number ){
        return number % 2 == 0 ;
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int number = sc.nextInt();
        if(even(number)){
            System.out.println("odd  Number");

        }else{
            System.out.println("even  Number");
        }
    }

}

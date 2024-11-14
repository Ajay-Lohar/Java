package ControlStatements.Whileloop;

public class Demo1 {
    public static void main(String[] args) {
        int number = 123456789;
        int sum = 0;

        while (number>0){
            int digit = number % 10 ;
            sum= sum + digit;
            number = number/10;
        }
        System.out.println("Sum Of Given Number " + sum);
    }
}

//Output:-
//Sum Of Given Number 6
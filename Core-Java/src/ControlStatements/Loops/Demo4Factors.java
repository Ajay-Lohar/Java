package ControlStatements.Loops;

public class Demo4Factors {
    public static void main(String[] args) {
       //factors
        int number = 10;
        for(int i =1 ; i <= number/2 ; i++){
            if(number % i == 0){
                System.out.println(i);
            }
        }
    }
}
//output :-
//1
//2
//5
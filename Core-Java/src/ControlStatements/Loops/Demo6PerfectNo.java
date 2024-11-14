package ControlStatements.Loops;

public class Demo6PerfectNo {
//    perfect number
    public static void main(String[] args) {
        int number = 6 ;
        int sum = 0 ;
        for (int i =1 ;i<=number/2 ; i++){
            if (number% i ==0){
                sum = sum+i;
            }

        }
        System.out.println(sum==number ?"Perfect":"Not Perfect");

    }
}
//output:- Perfect

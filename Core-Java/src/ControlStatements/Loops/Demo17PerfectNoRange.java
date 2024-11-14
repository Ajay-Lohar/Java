package ControlStatements.Loops;

public class Demo17PerfectNoRange {
    public static void main(String[] args) {

        for (int number =1 ;number<=1000;number++){
            int sum=0;
            for (int i = 1 ; i<=number/2;i++){
                if (number%i==0){
                    sum= sum+i;
                }
            }
            if (sum==number){
                System.out.println(number);
            }
        }
    }
}

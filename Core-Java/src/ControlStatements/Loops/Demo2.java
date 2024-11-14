package ControlStatements.Loops;

public class Demo2 {
    public static void main(String[] args) {
        //factors programe
        int number = 1000;
        int count = 1 ;
        for(int i = 1 ; i <= number/2 ;i++){

            if(number % i == 0){

                System.out.println("factor " + i + "\t" + count);
                count++;
            }
            // output is
//            factor 1
//            factor 2
//            factor 4
//            factor 5
//            .....
//            .....
//            .....
//            .....
//            .....
//            factor 250
//            factor 500
        }
    }
}

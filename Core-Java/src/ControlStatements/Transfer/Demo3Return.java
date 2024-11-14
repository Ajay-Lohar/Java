package ControlStatements.Transfer;

public class Demo3Return {
    public static void main(String[] args) {
        for (int i = 1; i <=100 ; i++) {


            if (i%5==0){
                return;
            }
            System.out.println(i);


        }
        System.out.println("hello");//<-- Not execute because return keyword  are in loop(end of Method)
    }
}

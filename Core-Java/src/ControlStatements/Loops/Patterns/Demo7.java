package ControlStatements.Loops.Patterns;

public class Demo7 {
    public static void main(String[] args) {
        int count =1;
        for(int row =5 ;row>=1;row--){
            for(int col =1 ;col<=row ;col++){
                System.out.print(count +" ");

            }
            System.out.println();
            count++;
        }
    }
}
//output:-
//        1 1 1 1 1
//        2 2 2 2
//        3 3 3
//        4 4
//        5
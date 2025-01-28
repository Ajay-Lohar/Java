package ControlStatements.Loops.Patterns;

public class Demo15Advance {
    public static void main(String[] args) {
        for (int row = 1 ;row <= 4 ;row++){
            for(int col = 1 ; col <= row ; col++){
                System.out.print(
                        ((col+row)%2==0)?"1":"0");
            }
            System.out.println();
        }
    }
}

//Output:-
//        1
//        01
//        101
//        0101
package ControlStatements.Loops.Patterns;

public class Demo13Advance {
    public static void main(String[] args) {
        for (int row=1 ;row<=5;row++) {
            //spaces
            for (int space=0 ;space<=5-row;space++){
                System.out.print(" ");
            }

            //number
            for (int number=1;number<=row;number++){
                System.out.print(number);
            }
            System.out.println();
        }
    }
}

//output:-
//     1
//    12
//   123
//  1234
// 12345
package ControlStatements.Loops.Patterns;

public class Demo14Advance {
    public static void main(String[] args) {
        for (int row=5;row>=1;row--){
           //spaces
            for (int space=1;space<=5-row;space++){
                System.out.print(" ");
            }
           //values
            for (int value=1;value<=row;value++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
//output:-
//     *****
//      ****
//       ***
//        **
//         *
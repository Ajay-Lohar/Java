package ControlStatements.Loops.Patterns;

public class Demo12Advance {
    public static void main(String[] args) {
        for (int row=1 ;row<=5;row++) {
            //spaces
            for (int space=0 ;space<=5-row;space++){
                System.out.print("   ");
            }

            //star
          for (int star=1;star<=row;star++){
              System.out.print(" * ");
          }
            System.out.println();
        }
    }
}

//output:-
//                    *
//                 *  *
//              *  *  *
//           *  *  *  *
//        *  *  *  *  *
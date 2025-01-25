package ControlStatements.Loops.Patterns;

public class Demo11 {
    public static void main(String[] args) {
        for (int row=1 ;row<=4;row++) {
            for (int col=1;col<=4;col++) {

 //               for (int col=1;col<=4-row;col++) {
//                System.out.print(" ");
//            }
//            for (int col=1;col<=row;col++) {
//                System.out.print("*");
//            }
//            System.out.println();

            if(row+col<=4){
                System.out.print(" ");
            }else {
                System.out.print("*");
            }

        }
            System.out.println();
      }

    }
}



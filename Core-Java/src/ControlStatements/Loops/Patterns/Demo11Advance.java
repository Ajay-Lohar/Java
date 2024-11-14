package ControlStatements.Loops.Patterns;

public class Demo11Advance {
    public static void main(String[] args) {
        for(int row=1;row<=3;row++){
            for (int col=1;col<=5;col++){
                System.out.print((col==3)?row:(row==3||(row ==2& col==2 ||row==2 & col==4))?" * ":"   ");


            }
            System.out.println();
        }

    }
}
//output:-
//             1
//           * 2 *
//        *  * 3 *  *
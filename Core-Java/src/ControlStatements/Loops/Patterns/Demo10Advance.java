package ControlStatements.Loops.Patterns;

public class Demo10Advance {
    public static void main(String[] args) {
        for (int row =1 ;row<=5 ;row++){
            for (int col=1 ;col<=5;col++){
                         System.out.print((col==1 || row ==1 ||col==5 ||row==5)?"* ":"  ");
            }
            System.out.println();
        }
    }
}
//  Output"-
//        * * * * *
//        *       *
//        *       *
//        *       *
//        * * * * *
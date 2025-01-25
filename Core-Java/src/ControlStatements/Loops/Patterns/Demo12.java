package ControlStatements.Loops.Patterns;

public class Demo12 {
    public static void main(String[] args) {
        //pascletrangle
        for(int row=1;row<=5;row++){
            for(int col=1;col<=row;col++){
                System.out.print(col+" ");
            }
            System.out.println();
        }

    }
}

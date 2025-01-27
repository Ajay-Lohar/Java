package WriteenTest.ThinketiveB;

public class Q1Pattern {
//    1       5
//    1 2   4 5
//    1 2 3 4 5
public static void main(String[] args) {
    for (int row = 1; row <=3 ; row++) {
        for (int col = 1; col <=5 ; col++) {
            System.out.print(
                    ((
                            (col==2 & row==1)||
                            (col==3 & row==1)||
                            (col==3 & row==2)||
                            (col==4 & row==1)
                    )?" ": col)

            );

        }
        System.out.println();

    }
}
}

package array;

public class Demo15 {
    public static void main(String[] args) {
        int[][] arrayOfArray = {
                {1, 2, 3},
                {4, 5, 6, 7},
                {8, 9, 10, 11, 12}
        };
        for (int index = 0; index < arrayOfArray[0].length; index++) {
            System.out.print(arrayOfArray[0][index] + " ");
        }
        System.out.println("all rows and columns");
        for (int row = 0; row < arrayOfArray.length; row++) {
            for (int column = 0; column < arrayOfArray[row].length; column++) {
                System.out.print(arrayOfArray[row][column] + " ");
            }
            System.out.println();
        }
    }
}

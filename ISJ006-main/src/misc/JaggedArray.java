package misc;

public class JaggedArray {
    public static void main(String[] args) {
        //jagged array : it is a multidimensional array which contains different size sub array
        int[][] array = {
                {1, 2, 3, 5},
                {1, 2, 3},
                {1, 2, 3, 5, 6}
        };
        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[row].length; column++) {
                System.out.print(array[row][column] + " ");
            }
            System.out.println();
        }
        System.out.println("for each loop");
        for (int[] tempArray : array) {
            for (int temp : tempArray) {
                System.out.print(temp + " ");
            }
            System.out.println();
        }
    }
}

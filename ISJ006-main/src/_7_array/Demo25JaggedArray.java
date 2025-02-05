package _7_array;

public class Demo25JaggedArray {
    public static void main(String[] args) {
        //jagged array : it is a multi-dimensional array which contains element array with different sizes

        int[][] array = {
                {1, 3, 4, 5},
                {1},
                {1, 2},
                {1, 2, 3},
        };
        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[row].length; column++) {
                System.out.print(array[row][column] + " ");
            }
            System.out.println();
        }
    }
}

package _7_array;

public class Demo19AccessingMatrix {
    public static void main(String[] args) {
        int[][] array = {
                {45, 56, 80},
                {87, 56, 70},
                {45, 46, 81},
                {85, 76, 56},
                {95, 86, 78},
                {85, 56, 98},
        };
        // * * *
        // * * *
        // * * *
        // * * *
        // * * *
        // * * *
        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[row].length; column++) {
                System.out.print(array[row][column] + " ");
            }
            System.out.println();
        }
    }
}

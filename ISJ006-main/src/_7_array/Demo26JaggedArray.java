package _7_array;

public class Demo26JaggedArray {
    public static void main(String[] args) {
        int[][] array = {
                {1, 3, 4, 5},
                {1},
                {1, 2},
                {1, 2, 3},
        };
        for (int[] tempArray : array) {
            for (int temp : tempArray) {
                System.out.print(temp + " ");
            }
            System.out.println();
        }
    }
}

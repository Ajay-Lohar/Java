package array;

public class Demo14 {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40};

        //jagged array : array which contains arrays with different length
        int[][] arrayOfArray = {
                {1, 2, 3},
                {4, 5, 6, 7},
                {8, 9, 10, 11, 12}
        };
        System.out.println(arrayOfArray.length);//outer array length 3
        System.out.println(arrayOfArray[0].length);//inner array length 3
        System.out.println(arrayOfArray[1].length);//inner array length 4
        System.out.println(arrayOfArray[2].length);//inner array length 5
    }
}

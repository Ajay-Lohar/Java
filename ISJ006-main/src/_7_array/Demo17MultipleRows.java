package _7_array;

public class Demo17MultipleRows {
    public static void main(String[] args) {
        //multi dimensional array
        int a = 10;
        int[] array1 = {10, 203, 50, 63, 12};
        //PCM
        int[][] array2 = {
                {45, 56, 80},
                {87, 56, 70},
                {45, 46, 81},
                {85, 76, 56},
                {95, 86, 78},
                {85, 56, 98},
        };
        System.out.println(array2.length);//6
        System.out.println(array2[0].length);//3
        System.out.println(array2[1].length);//3
        System.out.println(array2[2].length);//3
        System.out.println(array2[3].length);//3
        System.out.println(array2[4].length);//3
        System.out.println(array2[5].length);//3
    }
}

package _7_array;

public class Demo6 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(array.length);//7
        System.out.println(array);//reference :
        System.out.println(array.toString());//reference :

        int[] array2 = {};
        System.out.println(array2.length);//0

        int[] array3 = new int[-56];
        System.out.println(array3.length);
    }
}

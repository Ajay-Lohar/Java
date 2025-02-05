package _7_array;

public class Demo2 {
    public static void main(String[] args) {
        //using array
        int[] array = {10, 30, 40, 60, 70};
        System.out.println(array[0]);//10
        System.out.println(array[1]);//30
        System.out.println(array[2]);//40
        System.out.println(array[3]);//60
        System.out.println(array[4]);//70
        System.out.println(array[-1]);//ArrayIndexOutOfBoundsException
        System.out.println(array[5]);//ArrayIndexOutOfBoundsException
    }
}

package _7_array;

public class Demo29 {
    public static void main(String[] args) {
        Object[] array = new Object[5];
        array[0] = 10;
        array[1] = 10;
        array[2] = 'a';
        array[3] = true;
        array[4] = "strings";
        for (Object temp:array) {
            System.out.println(temp);
        }
        System.out.println("traditional for loop");
        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }
    }
}

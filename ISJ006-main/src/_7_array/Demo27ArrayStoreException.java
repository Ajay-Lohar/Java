package _7_array;

public class Demo27ArrayStoreException {
    public static void main(String[] args) {
        Object[] array = new Object[5];
        array[0] = "String value";
        array[1] = 20;
        array[2] = true;
        for (Object temp : array) {
            System.out.println(temp);
        }

    }
}

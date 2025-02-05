package misc.wrapperClasses;

public class Demo1 {
    public static void main(String[] args) {
        int a = 100;
        Integer i = a;// autoboxing : convert primitive to wrapper
        int b = i; // auto- unboxing : convert wrapper to primitive

        System.out.println(a);//100
        System.out.println(i);//100
        System.out.println(b);//100
    }
}

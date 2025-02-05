package objectClassMethods;

public class Demo5 {
    public static void main(String[] args) {
        Demo5 demo5 = new Demo5();
        System.out.println(demo5.getClass().getName() + "@" + Integer.toHexString(demo5.hashCode()));
        System.out.println(demo5);
        System.out.println(demo5.toString());
    }
}

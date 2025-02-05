package objectClassMethods;

public class Demo4ToStringMethod {
    public static void main(String[] args) {
        class A {
        }
        A a = new A();
        System.out.println(a);
        System.out.println(a.toString());
        System.out.println(Integer.toHexString(100));
    }
}

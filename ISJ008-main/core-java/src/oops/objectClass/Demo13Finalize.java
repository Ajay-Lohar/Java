package oops.objectClass;

public class Demo13Finalize {
    public static void main(String[] args) {
        class A {
            @Override
            protected void finalize() throws Throwable {
                System.out.println("Finalize method");
            }
        }
        A a = new A();
        a = null;
        System.gc();
        System.out.println("Rest of the main");
    }
}

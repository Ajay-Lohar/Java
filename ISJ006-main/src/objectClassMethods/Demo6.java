package objectClassMethods;

public class Demo6 {
    @Override
    public void finalize() throws Throwable {
        System.out.println("finalize method");
    }

    public static void main(String[] args) {
        Demo6 demo6 = new Demo6();
        demo6 = null;
        System.gc();
    }
}

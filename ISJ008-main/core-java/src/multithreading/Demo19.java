package multithreading;

public class Demo19 {

    class A {
        void m1() {
        }//IM

        synchronized void m2() {
        }//SIM

        static void m3() {
        }//SM

        synchronized static void m4() {
        }//SSM

        void m5() {
            synchronized (this) {
            }
        }

    }

    public static void main(String[] args) {

    }
}

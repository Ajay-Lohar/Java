package _6_oops.accessSpecifiers.p1;

public class A {
    public int p;
    private int q;
    protected int r;
    int s;
    static class B {
        public static void main(String[] args) {
            A a = new A();
            System.out.println(a.p);
            System.out.println(a.q);
            System.out.println(a.r);
            System.out.println(a.s);
        }
    }
}

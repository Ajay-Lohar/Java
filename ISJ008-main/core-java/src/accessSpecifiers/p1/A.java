package accessSpecifiers.p1;

public class A {
    public int p = 1;
    int q = 2;
    private int r = 3;
    protected int s = 4;

    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.p);
        System.out.println(a.q);
        System.out.println(a.r);
        System.out.println(a.s);
    }
}

package _6_oops.inheritance.constructorChaining;

public class R extends Q {
    R() {
        super();
        System.out.println("R class constructor");
    }

    public static void main(String[] args) {
        R r = new R();
    }
}

package _5_classComponents.blocks;

public class Demo2 {
    {
        System.out.println("instance block");
    }

    static {
        System.out.println("static block");
    }

    Demo2() {
        super();
        //1. constructor call --> this(100), super()
        //2. instance block of the same class
        System.out.println("constructor");
    }

    public static void main(String[] args) {
        Demo2 demo2 = new Demo2();
    }
}

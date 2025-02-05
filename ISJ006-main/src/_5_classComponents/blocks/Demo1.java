package _5_classComponents.blocks;

public class Demo1 {
    {
        System.out.println("instance block1");
    }

    {
        System.out.println("instance block2");
    }

    {
        System.out.println("instance block3");
    }

    static {
        System.out.println("static block1");
    }

    static {
        System.out.println("static block2");
    }

    static {
        System.out.println("static block3");
    }

    public static void main(String[] args) {
        System.out.println("main method");
        Demo1 demo1 = new Demo1();
    }
}

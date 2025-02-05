package _6_oops.finalKeyword;

public class Demo3 {
    final int instanceVariable;

    {
        instanceVariable = 10;
    }

    final static int staticVariable;

    static {
        staticVariable = 100;
    }

    public static void main(String[] args) {
        Demo3 demo2 = new Demo3();
        final int localVariable = 10;
        //localVariable = 299;
        //demo2.instanceVariable = 99;
        //Demo2.staticVariable=99;


        System.out.println("Local variable " + localVariable);
        System.out.println("Static variable " + Demo3.staticVariable);
        System.out.println("Instance variable " + demo2.instanceVariable);
    }
}

package _6_oops.finalKeyword;

public class Demo2 {
    final int instanceVariable = 1;
    final static int staticVariable = 2;

    public static void main(String[] args) {
        Demo2 demo2 = new Demo2();
        final int localVariable = 10;
        //localVariable = 299;
        //demo2.instanceVariable = 99;
        //Demo2.staticVariable=99;


        System.out.println("Local variable " + localVariable);
        System.out.println("Static variable " + Demo2.staticVariable);
        System.out.println("Instance variable " + demo2.instanceVariable);
    }
}

package oops.inheritance;

public class ParentChildTest2 {
    public static void main(String[] args) {
       Parent pc = new Child();
       //1. p --> p
       //1. c --> CTE
       //1. pc --> v-p, m-c
        System.out.println(pc.str);  // parent
        pc.m1(); //child

    }
}

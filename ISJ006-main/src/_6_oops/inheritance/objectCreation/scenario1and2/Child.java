package _6_oops.inheritance.objectCreation.scenario1and2;

public class Child extends Parent{
    int x;
    int y;

    void m2() {
        System.out.println("Child class : m2");
    }

    public static void main(String[] args) {
        Parent parent = new Parent();
        System.out.println(parent.a);
        System.out.println(parent.b);
        parent.m1();

        //CTE: try to access child class
      /*  System.out.println(parent.x);
        System.out.println(parent.y);
        parent.m2();*/

       // Child cp = new Parent();//CTE

    }
}

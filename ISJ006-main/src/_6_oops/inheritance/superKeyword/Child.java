package _6_oops.inheritance.superKeyword;

public class Child extends Parent {
    int a = 1000;

    void display() {
        //int a = 10000;
        System.out.println("Local variable " + a);//1000
        System.out.println("Instance variable of the same class " + this.a);//1000
        System.out.println("Super class instance variable "+super.a);//1000
    }

    public static void main(String[] args) {
        Child child = new Child();
        child.display();
        System.out.println(child.toString());
    }
}

package _6_oops.inheritance.superKeyword;

public class GrandChild extends Child{
    int a = 989898;

    void display() {
        int a = 123;
        System.out.println("Local variable " + a);//123
        System.out.println("Instance variable of the same class " + this.a);//989898
        System.out.println("Super class instance variable "+super.a);//100
        //System.out.println("grand parent class instance variable "+super.super.a);//CTE
    }
    public static void main(String[] args) {
        GrandChild grandChild = new GrandChild();
        grandChild.display();
    }
}

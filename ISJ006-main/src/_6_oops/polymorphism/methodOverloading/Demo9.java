package _6_oops.polymorphism.methodOverloading;

public class Demo9 {
    public static void main(String[] args) {
        class Parent {
            Parent() {
                System.out.println("parent class");
            }
        }
        class Child extends Parent {
            Child() {
                System.out.println("Child con");
            }
           /* Parent(){
                System.out.println("parent class");
            }*/
        }
    }
}

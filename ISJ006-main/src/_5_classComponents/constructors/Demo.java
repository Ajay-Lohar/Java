package _5_classComponents.constructors;

public class Demo {
    Demo() {
        System.out.println("Zero param constructor");
    }

    void Demo() {
        System.out.println("this is instance method and not constructor");
    }

    public static void main(String[] args) {
        Demo demo = new Demo();

        demo.Demo();
    }
}

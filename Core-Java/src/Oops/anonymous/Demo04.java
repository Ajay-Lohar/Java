package Oops.anonymous;

public class Demo04 {
    public static void main(String[] args) {
         interface A{
            void m1();
        }
        A service3 = () -> System.out.println("sending message using message lambda implementation");
        service3.m1();
    }
}

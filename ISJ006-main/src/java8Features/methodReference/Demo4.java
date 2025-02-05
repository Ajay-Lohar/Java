package java8Features.methodReference;

public class Demo4 {
    public static void main(String[] args) {
        Thread thread = new Thread(
                () -> System.out.println("run method implemented using lambda expression")
        );
    }
}

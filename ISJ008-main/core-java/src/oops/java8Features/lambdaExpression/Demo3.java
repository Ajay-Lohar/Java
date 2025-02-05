package oops.java8Features.lambdaExpression;

public class Demo3 {
    public static void main(String[] args) {
        @FunctionalInterface
        interface Supplier {
            int get();
        }
        Supplier supplier = () -> 10;
        System.out.println(supplier.get());
    }
}

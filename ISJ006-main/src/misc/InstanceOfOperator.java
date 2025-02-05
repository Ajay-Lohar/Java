package misc;

public class InstanceOfOperator {
    static class Product {
    }

    static class Student {
    }

    public static void main(String[] args) {


        Object obj1 = new Product();
        Object obj2 = new Student();

        print(obj2);
    }

    private static void print(Object obj) {

        if (obj instanceof Product) {
            System.out.println("Its product");
        }
        if (obj instanceof Student) {
            System.out.println("Its student");
        }
    }
}

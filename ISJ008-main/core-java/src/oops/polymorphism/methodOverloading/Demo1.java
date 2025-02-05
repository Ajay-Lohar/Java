package oops.polymorphism.methodOverloading;

public class Demo1 {
    public static void main(String[] args) {
        class A {
            int add(int number1, int number2) {
                return number1 + number2;
            }

            int add(int number1, int number2, int number3) {
                return number1 + number2 + number3;
            }
        }

        class B extends A {
            //method overloading -> different signature
            String add(String str1, String str2) {
                return str1 + str2;
            }

        }

        B b = new B();
        System.out.println(b.add(100, 200));
        System.out.println(b.add(100, 200, 300));
        System.out.println(b.add("good", " morning"));
    }
}

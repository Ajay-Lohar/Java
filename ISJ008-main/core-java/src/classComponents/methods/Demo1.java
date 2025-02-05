package classComponents.methods;

public class Demo1 {
    //method definition --> instance method
    int add(int number1, int number2) {
        return number1 + number2;
    }

    //method definition  --> static method
    public static boolean isPrime(int number) {
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("main method");
        Demo1 ref = new Demo1();

        //calling instance method using reference variable
        System.out.println("Addition is "+ ref.add(200,300));

        // calling static method using class name
        System.out.println("Is the number prime : "+Demo1.isPrime(19));
    }
}

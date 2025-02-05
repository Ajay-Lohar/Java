package _3_operators.bitwiseOperators;

public class Demo1 {
    public static void main(String[] args) {
        System.out.println("Bitwise AND operation");
        System.out.println(true & true); // true
        System.out.println(false & false); //false
        System.out.println(false & true);//false
        System.out.println(true & false);//false

        System.out.println("Bitwise OR operation");
        System.out.println(true | true); // true
        System.out.println(false | false); //false
        System.out.println(false | true);//true
        System.out.println(true | false);//true

        System.out.println("Bitwise XOR operation");
        System.out.println(true ^ true); // false
        System.out.println(false ^ false); //false
        System.out.println(false ^ true);//true
        System.out.println(true ^ false);//true
    }
}

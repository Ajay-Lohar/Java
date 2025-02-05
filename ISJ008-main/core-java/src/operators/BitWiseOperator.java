package operators;

public class BitWiseOperator {
    public static void main(String[] args) {
        System.out.println("Bitwise AND Operation");
        System.out.println(true & true); //true
        System.out.println(false & false);//false
        System.out.println(true & false);//false
        System.out.println(false & true);//false

        System.out.println("Bitwise OR Operation");
        System.out.println(true | true); //true
        System.out.println(false | false);//false
        System.out.println(true | false);//true
        System.out.println(false | true);//true

        System.out.println("Bitwise XOR Operation");
        System.out.println(true ^ true); //false
        System.out.println(false ^ false);//false
        System.out.println(true ^ false);//true
        System.out.println(false ^ true);//true
    }
}

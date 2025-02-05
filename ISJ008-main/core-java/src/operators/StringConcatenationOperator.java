package operators;

public class StringConcatenationOperator {
    public static void main(String[] args) {
        // + is string concatenation
        // + is the only overloaded operator in java
        // mathematical addition
        //string concatenation
        System.out.println(10 + 20);//add 30
        System.out.println(10 + "20");//concat 1020
        System.out.println(10 + 20 + "10" + "20");//301020
        System.out.println('A' + 'A');//130
        System.out.println('A' + "A");//AA
        System.out.println('A' + 'A' + "A");//130A
        System.out.println('A' + "A" + 'A');//AAA
        System.out.println(10 + "A" + 20 + 30);//10A2030
        System.out.println(10 + "A" + (20 + 30));//10A50
        System.out.println((10 + "A") + 20 + 30);//10A2030
    }
}

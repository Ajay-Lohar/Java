package _3_operators.stringConcatenation;

public class Demo2 {
    public static void main(String[] args) {
        System.out.println("A" + 'A' + "A");//AAA
        System.out.println('A' + 'A' + "A");//130A
        System.out.println('A' + 'A' + "A" + 'A');//130AA
        System.out.println(10 + 'A' + 20 + 'A' + "A" + 10 + 20);//160A1020
    }
}

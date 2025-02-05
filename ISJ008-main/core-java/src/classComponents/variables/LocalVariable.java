package classComponents.variables;

public class LocalVariable {
    public static void main(String[] args) {
        //args is local reference variable
        int a = 100;//primitive local variable
        String str = "good morning"; //local reference variable
        System.out.println(a);
        System.out.println(str);
        System.out.println(add(200, 300));
    }

    public static int add(int number1, int number2) {
        return number1 + number2;
    }
}

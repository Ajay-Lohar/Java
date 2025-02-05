package _5_classComponents.variables;

public class Demo1LocalVariable {
    public static void main(String[] args) {
        //args : non-primitive local variable
        int left = 10;//primitive local variable
        int right = 5;//primitive local variable
        String xyz = "xyz";//non-primitive local variable
        System.out.println(left + "\t" + right);
        display();
    }

    public static void display() {
       // System.out.println(xyz);
    }
}

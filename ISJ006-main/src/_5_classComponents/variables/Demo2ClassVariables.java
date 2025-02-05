package _5_classComponents.variables;

public class Demo2ClassVariables {
    int a = 10;//instance variable
    static int b = 100;//static variable

    public static void main(String[] args) {
        // to access instance variable we use reference.instanceVariableName
        Demo2ClassVariables ref = new Demo2ClassVariables();
        System.out.println(ref.a);//10

        // to access static variables we use ClassName.staticVariableName
        System.out.println(Demo2ClassVariables.b);//100
    }
}

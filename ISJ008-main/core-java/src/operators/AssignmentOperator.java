package operators;

public class AssignmentOperator {
    public static void main(String[] args) {
        // = is an assignment operator  which is used assign RHS to lHS
        int a = 10; // direct value
        a = 10 * 2; // expression
        int b = a; //variable
        int c = add(10, 20);
        int d = 10;
        System.out.println("a value is " + a);//20
        System.out.println("b value is " + b);//20
        System.out.println("c value is " + c);//30
        System.out.println(d = 100);//100
       //System.out.println(100 = d);//CTE


    }

    private static int add(int number1, int number2) {
        return number1 + number2;
    }
}

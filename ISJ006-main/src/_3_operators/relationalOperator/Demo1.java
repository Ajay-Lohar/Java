package _3_operators.relationalOperator;

public class Demo1 {
    public static void main(String[] args) {
        System.out.println(10 > 20);//false
        System.out.println(10 < 20);//true
        System.out.println(10 >= 20);//false
        System.out.println(10 <= 20);//true
        System.out.println(10 == 20);//false
        System.out.println(10 != 20);//true

       /* System.out.println(true > true);//CTE
        System.out.println(true < true);//CTE
        System.out.println(true >= true);//CTE
        System.out.println(true <= true);//CTE*/

        System.out.println(true == true);//true
        System.out.println(true != true);//false
        System.out.println(true != false);//true
        System.out.println(false != false);//false
        System.out.println(false == false);//true
    }
}

package ClassComponants.Methods;

public class Demo06Swap {
    public static void main(String[] args) {

        int number1 =1000;
        int number2 =2000;
        swap(number1,number2);// 2000 1000

        System.out.println("local variable print ");
        System.out.println(number1 +"     "+ number2); // 1000 2000
    }
    public static void swap(int number1 ,int number2){
       int temp= number1 ;
         number1=number2;
         number2 =temp;
        System.out.println("Methods swap");
        System.out.println(number1 +" \t "+ number2);
    }
}

package variable;


public class Demo01 {

    int a =10; //Instance Variable
    int b =20;//Instance Variable
   static int c =30;// Static Variable

    public static void main(String[] args) {
        int a =100;  // Local Variable
        int b =200;  // Local Variable
        int c =300;  // Local Variable

        System.out.println("print Local Variable "+a);
        System.out.println("print Local Variable "+b);
        System.out.println("print Local Variable "+c);

        Demo01 Demo =new Demo01();// create new object
        System.out.println("print Instance Variable "+Demo.a);
        System.out.println("print Instance Variable "+Demo.b);
        System.out.println("print Instance Variable "+Demo01.c);  // direct access by class name because this is static variable


    }
}

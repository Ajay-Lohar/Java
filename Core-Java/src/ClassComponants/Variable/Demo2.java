package ClassComponants.Variable;

public class Demo2 {
    int a =10; //instance variable
    int b= 20;//instance variable
    static int c =30; //Static variable

    public static void main(String[] args) {
        int a= 100;//Local variable
        int b= 200;//Local variable
        int c= 300;//Local variable

        System.out.println("Local variables\t"+a);//100
        System.out.println("Local variables\t"+b);//200
        System.out.println("Local variables\t"+c);//300


        Demo2 d =new Demo2();
        System.out.println("Instance variables\t"+d.a);//10
        System.out.println("Instance variables\t"+d.b);//20
        System.out.println("Static variables\t"+Demo2.c);//30 <--thise call by useing class name





    }
}

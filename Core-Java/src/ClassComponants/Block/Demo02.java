package ClassComponants.Block;

public class Demo02 {
//    static Block
    static{
        System.out.println("static Block");
    }
//    instance Block
    {
        System.out.println("instance block");
    }
    Demo02(){
        System.out.println(" Demo1 Zero para constructor block");
    }
    Demo02(int a){
        this();
        System.out.println("Demo2 para constructor");
    }

    public static void main(String[] args) {
        Demo02 obj = new Demo02(10);
    }
}

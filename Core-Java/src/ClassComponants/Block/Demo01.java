package ClassComponants.Block;

public class Demo01 {
    // static block
    static {
        System.out.println("static block ");// static block executed only once at the the class loading
    }

    //    instance block
        {
            System.out.println("instance bloclk");//instance block executed everytime object of the given class is created
        }

        public Demo01(){
            System.out.println(" Constructor ");
        }

    public static void main(String[] args) {
        Demo01 demo = new Demo01();//instance block executed everytime object of the given class is created
        System.out.println("main method ");// main method execute last
    }
}

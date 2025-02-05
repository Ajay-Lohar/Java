package _5_classComponents.nestedClasses;

public class Demo4 {
    public static void main(String[] args) {
        //System.out.println(10 != true);
        display();
    }

    static void display() {
        //1. define local inner class
        class Local {
            // only non-static members
            //static int a = 100;//CTE
            //static void m1(){}//CTE
            //static {}//CTE
            int variable = 100;

            void method() {
                System.out.println("instance method of the local inner class");
            }
        }
        //2. create the object of Local inner class
        Local local = new Local();
        //3. access the members of local inner class
        System.out.println(local.variable);
        local.method();
    }
}

package _4_controlStatements.transfer;

public class Demo1Break {
    public static void main(String[] args) {
        System.out.println("main method");
        //break;//CTE
        switch (1) {
            case 1:
                System.out.println("one");
                  break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
        }
    }
}

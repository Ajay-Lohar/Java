package controlStatements.decisionMaking.switchDemos;

public class Demo1 {
    public static void main(String[] args) {
        int number = 10;
        switch (number) {
            case 1: {
                System.out.println("one");
            }
            break;
            case 2: {
                System.out.println("Two");
            }
            break;
            default: {
                System.out.println("Invalid input");
            }
            break;
        }
    }
}

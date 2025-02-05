package controlStatements.decisionMaking.ifElse;

public class Demo1 {
    public static void main(String[] args) {
        boolean isEmpty = false;
        if (execute()) {
            System.out.println("1");
            System.out.println("2");
            System.out.println("3");
        }
        System.out.println("rest of the main method");
    }

    private static boolean execute() {
        return true;
    }

}

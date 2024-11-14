package ClassComponants.Methods;

public class Demo3 {
    public static void main(String[] args) {
        System.out.println("Given Age Is eligibal for vote " + eligibal(34));
        System.out.println("Given Age Is eligibal for vote " + eligibal(14));
    }
    public static boolean eligibal(int number){
        return number >= 18 ;
    }
}

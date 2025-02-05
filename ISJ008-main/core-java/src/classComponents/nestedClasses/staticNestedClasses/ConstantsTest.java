package classComponents.nestedClasses.staticNestedClasses;

public class ConstantsTest {
    public static void main(String[] args) {
        System.out.println("MySql development credentials");
        System.out.println("Username "+Constants.MySql.Dev.USERNAME);
        System.out.println("Password "+Constants.MySql.Dev.PASSWORD);


        System.out.println("MySql production credentials");
        System.out.println("Username "+Constants.MySql.Prod.USERNAME);
        System.out.println("Password "+Constants.MySql.Prod.PASSWORD);
    }
}

package _5_classComponents.nestedClasses;

public class ConstantsTest {
    public static void main(String[] args) {
        System.out.println(Constants.MySql.Dev.USERNAME);
        System.out.println(Constants.MySql.Dev.PASSWORD);

        System.out.println(Constants.MySql.QA.USERNAME);
        System.out.println(Constants.MySql.QA.PASSWORD);

        System.out.println(Constants.MySql.Prod.USERNAME);
        System.out.println(Constants.MySql.Prod.PASSWORD);

    }
}

package _5_classComponents.nestedClasses;

public class Constants {
    static class MySql {
        static class Dev {
            public static final String USERNAME = "MySQl DEV user";
            public static final String PASSWORD = "MySQl DEV pass";
        }

        static class QA {
            public static final String USERNAME = "MySQl QA user";
            public static final String PASSWORD = "MySQl QA pass";
        }

        static class Prod {
            public static final String USERNAME = "MySQl Prod user";
            public static final String PASSWORD = "MySQl Prod pass";
        }
    }
}

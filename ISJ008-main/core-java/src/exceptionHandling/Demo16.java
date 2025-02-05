package exceptionHandling;

public class Demo16 {
    public static void main(String[] args) {
        String[] stringsArray = null;/*{"abc", "xyz", "pqr"}*/
        String x = null;
        try{
            System.out.println(findElementInArray(stringsArray, x));
        }catch (NullPointerException nullPointerException){
            System.out.println("exception handled in main");
        }
    }

    private static boolean findElementInArray(String[] stringsArray, String x) throws NullPointerException {
       /* if (stringsArray == null || x == null) {
            return false;
        }*/
        for (String temp : stringsArray) {
            if (temp.equalsIgnoreCase(x)) {
                return true;
            }
        }
        return false;
    }
}

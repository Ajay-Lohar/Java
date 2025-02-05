package classComponents.methods;

public class EllipsisOperator2 {
    public static String magicString(String... strings) {
        String result = null;
        for (String str : strings) {
            if (str.length() > 10) {
                result = str;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(magicString("Prathameesh", "Raju", "Pratik", "Komal", "Kartik"));
    }
}

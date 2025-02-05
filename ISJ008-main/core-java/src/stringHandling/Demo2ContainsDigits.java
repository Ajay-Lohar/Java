package stringHandling;

public class Demo2ContainsDigits {
    public static void main(String[] args) {
        char[] charArray = {'A', 'B', 'A', 'B', 'A', '1'};
        boolean isDigit = false;
        for (char ch : charArray) {
            if (ch >= '0' && ch <= '9') {
                isDigit = true;
                break;
            }

        }
        System.out.println(isDigit ? "contains digit" : "does not contain");

    }
}

package _7_stringHandling;

public class Demo11Manipulation {
    public static void main(String[] args) {
        String str = "abcdefg123ebg123xyz8765";
        String numbers = "";
        String alphabets = "";
        for (int index = 0; index < str.length(); index++) {
            char ch = str.charAt(index);
            if (ch >= '0' && ch <= '9') {
                numbers = numbers + ch;
            } else {
                alphabets = alphabets + ch;
            }
        }
        System.out.println(numbers);
        System.out.println(alphabets);

    }
}

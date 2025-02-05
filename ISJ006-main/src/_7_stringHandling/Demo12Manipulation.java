package _7_stringHandling;

public class Demo12Manipulation {
    public static void main(String[] args) {
        String str = "abcdefg123ebg123xyz8765";
        StringBuilder numbers = new StringBuilder();
        StringBuilder alphabets = new StringBuilder();
        for (int index = 0; index < str.length(); index++) {
            char ch = str.charAt(index);
            if (ch >= '0' && ch <= '9') {
                numbers.append(ch);
            } else {
                alphabets.append(ch);
            }
        }
        System.out.println(numbers);
        System.out.println(alphabets);


    }
}

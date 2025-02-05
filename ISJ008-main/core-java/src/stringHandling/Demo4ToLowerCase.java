package stringHandling;

public class Demo4ToLowerCase {
    public static void main(String[] args) {
        char[] charArray = {'A', 'B', 'A', 'B', 'A', 'a', 'b', 'c'};
        for (int index = 0; index < charArray.length; index++) {
            if (charArray[index] >= 'A' && charArray[index] <= 'Z') {
                charArray[index] = (char) (charArray[index] + 32);
            }
        }

        for (char ch : charArray) {
            System.out.print(ch + " ");
        }
    }
}

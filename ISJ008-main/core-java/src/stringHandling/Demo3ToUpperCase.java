package stringHandling;

public class Demo3ToUpperCase {
    public static void main(String[] args) {
        char[] charArray = {'A', 'B', 'A', 'B', 'A', 'a', 'b', 'c'};
        for (int index = 0; index < charArray.length; index++) {
            if (charArray[index] >= 'a' && charArray[index] <= 'z') {
                charArray[index] = (char) (charArray[index] - 32);
            }
        }

        for (char ch : charArray) {
            System.out.print(ch + " ");
        }
    }
}

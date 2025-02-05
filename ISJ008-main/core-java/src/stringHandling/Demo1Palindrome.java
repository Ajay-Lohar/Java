package stringHandling;

public class Demo1Palindrome {
    public static void main(String[] args) {
        char[] charArray = {'A', 'B', 'A', 'B','A'};
        boolean isPalindrome = true;
        for (int left = 0, right = charArray.length - 1; left < right; left++, right--) {
            if (charArray[left] != charArray[right]) {
                isPalindrome = false;
                break;
            }
        }
        System.out.println(isPalindrome ? "Its palindrome" : "not a palindrome");
    }
}

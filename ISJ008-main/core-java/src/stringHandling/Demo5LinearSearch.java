package stringHandling;

public class Demo5LinearSearch {
    public static void main(String[] args) {
        //time complexity : worst o(n), best o(1)
        char[] charArray = {'A', 'B', 'A', 'B', 'A', 'a', 'b', 'c'};
        char x = 'a';
        boolean isPresent = false;
        for (char ch : charArray) {
            if (ch == x) {
                isPresent = true;
                break;
            }
        }
        System.out.println(isPresent ? "it is present" : "not present");
    }
}

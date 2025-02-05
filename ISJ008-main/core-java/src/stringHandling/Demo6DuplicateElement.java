package stringHandling;

public class Demo6DuplicateElement {
    public static void main(String[] args) {
        char[] charArray = {'A', 'B', 'C', 'D', 'E'};
        boolean isDuplicate = false;
        for (int i = 0; i < charArray.length; i++) {
            for (int j = 0; j < charArray.length; j++) {
                if (charArray[i] == charArray[j] && (i != j)) {
                    isDuplicate = true;
                    break;
                }
            }
        }
        System.out.println(isDuplicate ? "Duplicate" : "not duplicate");
    }
}

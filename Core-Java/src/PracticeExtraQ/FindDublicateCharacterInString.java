package PracticeExtraQ;

public class FindDublicateCharacterInString {
    public static void main(String[] args) {
        String str = "malayalam";
        char[] ch = str.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            for (int j = i + 1; j < ch.length; j++) {
                if (ch[i] == ch[j]) {
                    System.out.println("Dublicate Character is : " + ch[i] + " at index " + i);
                }
            }
        }
    }
}

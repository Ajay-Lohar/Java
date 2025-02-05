package stringHandling;

public class Demo15Reverse {
    public static void main(String[] args) {
        String str = "good morning";
        //String reverse = "";
        StringBuilder reverse = new StringBuilder();
        for (int index = str.length() - 1; index >= 0; index--) {
            //System.out.print(str.charAt(index));
            //creating string object inside the loop is the worst programming languages
            //reverse = reverse + str.charAt(index);
            reverse.append(str.charAt(index));
        }
        System.out.println(reverse);
    }
}

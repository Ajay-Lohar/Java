package StringHandling;

public class Demo6 {
    public static void main(String[] args) {
        StringBuffer stringBuilder = new StringBuffer();
        stringBuilder.append("string Data");// at the end
        stringBuilder.insert(0,"Python ");
        stringBuilder.delete(3,5);

        // insert ,append ,delete

        System.out.println(stringBuilder);
        String str = "Ajay";
        StringBuffer stringbuffer2 = new StringBuffer(str);

        stringbuffer2.reverse();
        System.out.println(stringbuffer2);

    }
}

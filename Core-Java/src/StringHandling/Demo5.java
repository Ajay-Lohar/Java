package StringHandling;

public class Demo5 {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("string Data");// at the end
        stringBuilder.insert(0,"Python ");
        stringBuilder.delete(3,5);

        // insert ,append ,delete

        System.out.println(stringBuilder);
        String str = "Ajay";
        StringBuilder stringbuilder2 = new StringBuilder(str);

        stringbuilder2.reverse();
        System.out.println(stringbuilder2);

    }
}

package stringHandling;

public class Demo19 {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("abc");
        stringBuilder.append(" added at last");
        stringBuilder.insert(0,"added first ");
        stringBuilder.delete(0,5);
        stringBuilder.deleteCharAt(5);
        System.out.println(stringBuilder);

        StringBuffer stringBuffer = new StringBuffer("it is thread safe");
        stringBuffer.reverse();
        System.out.println(stringBuffer);

        //to change the object content
        StringBuilder stringBuilder1 = new StringBuilder("abc");
        StringBuilder stringBuilder2 = new StringBuilder("abc");
        System.out.println(stringBuilder1.equals(stringBuilder2)); //false

//        StringBuilder stringBuilder3 = "abc";
        System.out.println(stringBuilder1.length());
    }
}

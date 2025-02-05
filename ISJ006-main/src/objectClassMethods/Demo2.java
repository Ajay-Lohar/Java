package objectClassMethods;

public class Demo2 {
    public static void main(String[] args) {
        Demo2 ref1 = new Demo2();
        Demo2 ref2 = new Demo2();
        Demo2 ref3 = ref1;
        Demo2 ref4 = ref2;
        System.out.println(ref1.hashCode());//23934342
        System.out.println(ref3.hashCode());//23934342
        System.out.println(ref2.hashCode());//22307196
        System.out.println(ref4.hashCode());//22307196
    }
}

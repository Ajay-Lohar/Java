package oops.objectClass;

public class Demo8 {
    public static void main(String[] args) {
        Demo8 ref = new Demo8();
        System.out.println(ref.hashCode());//integer value
        System.out.println(Integer.toHexString(ref.hashCode()));//hexa decimal value
        System.out.println(ref.getClass().getName());
        System.out.println(ref.getClass().getName() + "@" + Integer.toHexString(ref.hashCode()));
        System.out.println(ref.toString());
        System.out.println(ref);
    }
}

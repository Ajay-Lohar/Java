package ClassComponants.NestedClass;

public class Demo01 {
    public static void main(String[] args) {
        Outer ot =new Outer();
        System.out.println("instance variable of outer class : a "+ot.a);
        ot.m1(); // thise is call the m1 method in outr=er class

        Outer.inner in = ot.new inner();
        System.out.println("instance variable of outer class : b "+in.b);
    }
}

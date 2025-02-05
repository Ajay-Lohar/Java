package objectClassMethods;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Demo1 extends Object {
    public void m1() {
    }

    public void m2() {
    }

    int a;
    int b;

    public static void main(String[] args) {
        Demo1 d = new Demo1();
        Class classReference = d.getClass();
        Method[] methods = classReference.getMethods();
        Field[] fields = classReference.getFields();
        for (Method method : methods) {
            System.out.println(method);
        }
        System.out.println(d.getClass());

    }
}

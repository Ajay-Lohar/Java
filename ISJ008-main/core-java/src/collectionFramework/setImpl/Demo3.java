package collectionFramework.setImpl;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Demo3 {
    public static void main(String[] args) {
        // unique
        // homogenous data only otherwise ClassCastException
        //null not even once otherwise NullPointerException
        // sorting order is maintained
        Set set = new TreeSet();
        set.add(100);
        set.add(100);
       // set.add("string data");
       // set.add("abc");
        set.add(200);
        set.add(21);
        //set.add(null);
        System.out.println(set);
       // System.out.println(set.get);//GET method is not there
    }
}

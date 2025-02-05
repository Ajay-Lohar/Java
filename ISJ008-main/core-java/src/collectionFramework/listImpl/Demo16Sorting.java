package collectionFramework.listImpl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Vector;

public class Demo16Sorting {
    public static void main(String[] args) {
        ArrayList<String> studentList = new ArrayList<>();
        studentList.add("Durwang");
        studentList.add("Trupti");
        studentList.add("Komal");
        studentList.add("Ruchita");
        studentList.add("PK");
        studentList.add("Dharma");
        studentList.add("Navid");
        studentList.add("Adarsh");
        studentList.add("Swapnil");
        studentList.add("Don Rohit");
        System.out.println("Before sorting");
        System.out.println(studentList);
        Collections.sort(studentList);
        System.out.println("Before sorting");
        System.out.println(studentList);


    }
}

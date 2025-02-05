package collectionFramework.listImpl;

import java.util.ArrayList;

public class Demo12RemoveIf {
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
       // studentList.removeIf((studentName->studentName.length()>5));
        studentList.removeIf(studentName->studentName.contains("a"));
        System.out.println(studentList);
    }
}

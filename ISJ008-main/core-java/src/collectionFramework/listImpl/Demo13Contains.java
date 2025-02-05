package collectionFramework.listImpl;

import java.util.ArrayList;

public class Demo13Contains {
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
        System.out.println("Is PK there in the list " + studentList.contains("PK"));

        ArrayList<String> searchList = new ArrayList<>();
        searchList.add("Durwang");
        searchList.add("Dharma");
        searchList.add("Rohit");
        searchList.add("Sandeep");
        System.out.println(studentList.containsAll(searchList));
    }
}

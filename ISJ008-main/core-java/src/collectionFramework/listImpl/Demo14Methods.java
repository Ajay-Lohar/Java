package collectionFramework.listImpl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Consumer;

public class Demo14Methods {
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

        //iterate elements
        //1. using toString
        System.out.println(studentList);

        //2. using traditional for loop
        for (int index = 0; index < studentList.size(); index++) {
            System.out.println(studentList.get(index));
        }

        //3. using enhance for loop
        System.out.println("************************* using enhanced for loop ******************");
        for (String name: studentList){
            System.out.println(name);
        }
        System.out.println("************************* using Java 8 ******************");

       /* Consumer<String> consumer =  (string)-> System.out.println(string);
        studentList.forEach(consumer);*/
        studentList.forEach(System.out::println);

        System.out.println("************************* using Iterator ******************");

        Iterator<String> iterator = studentList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}

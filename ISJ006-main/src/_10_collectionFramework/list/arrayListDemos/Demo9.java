package _10_collectionFramework.list.arrayListDemos;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Demo9 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(100);
        //list.add("abc");
        //list.add(true);
        list.add(200);
        list.add(300);
        list.add(30);
        list.add(3);
        list.add(33);

        //1. directly printing the collection
        //System.out.println(list);

        //2. using traditional for loop
       /* for (int index = 0; index < list.size(); index++) {
            System.out.println(list.get(index));
        }*/

        //3. using enhanced for loop  or for each
        /*for (Integer temp : list){
            System.out.println(temp);
        }*/

        //4. java 8 way
        Consumer<Integer> consumer =  (integer)-> System.out.println(integer);
       // list.forEach(consumer);
        list.forEach(System.out::println);

    }
}

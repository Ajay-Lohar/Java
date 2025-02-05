package collectionFramework.listImpl;

import java.util.ArrayList;

public class Demo8 {
    public static void main(String[] args) {
        //type safety
        ArrayList<String> stringArrayList = new ArrayList();
//        stringArrayList.add(100);//CTE
        stringArrayList.add("MI");
        stringArrayList.add("CSK");
        stringArrayList.add("KKR");
        stringArrayList.add("PBXI");

        ArrayList<Integer> integerArrayList = new ArrayList<>();
//        integerArrayList.add("abc");
        integerArrayList.add(100);
        integerArrayList.add(200);
        integerArrayList.add(300);
        integerArrayList.add(400);

        System.out.println(stringArrayList);
        System.out.println(integerArrayList);
        System.out.println("Is it empty "+integerArrayList.isEmpty());//false
    }
}

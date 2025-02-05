package collectionFramework.listImpl;

import java.util.ArrayList;

public class Demo5 {
    public static void main(String[] args) {
        //Iterable --> Collection -->List --> ArrayList
        ArrayList arrayList1 = new ArrayList<>();//array will be created with DC = 10
        ArrayList arrayList2 = new ArrayList<>(150);//array will be created with CC = 150
        ArrayList arrayList3 = new ArrayList<>(arrayList2);//new list is created using existing one.
    }
}

package _10_collectionFramework.list.arrayListDemos;

public class Demo1 {
    public static void main(String[] args) {
        DynamicArray array = new DynamicArray();
        array.add(10);
        array.add("abc");
        array.add("xyz");
        array.add(true);
        array.add(10);
        array.add(10);
        array.add(10);
        array.add(10);
        array.add(10);
        array.add(10);
        array.add(10);
        array.add(10);
        array.add(10);
        array.add(10);
        array.add(10);
        array.add(10);
        array.add(10);
        array.add(10);
        array.add(10);
        array.add(10);
        array.add(10);
        array.add(10);
        array.add(10);
        array.add(10);
        array.add(10);
        array.add(10);
        array.add(10);
        array.add(10);
        array.add(10);
        array.add(10);
        System.out.println("Size " + array.size());
        for (Object temp : array.array) {
            System.out.println(temp);
        }
    }
}

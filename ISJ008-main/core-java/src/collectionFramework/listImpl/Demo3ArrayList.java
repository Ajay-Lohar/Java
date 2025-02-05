package collectionFramework.listImpl;


public class Demo3ArrayList {
    public static void main(String[] args) {

        //ds definition
        class ArrayList {
            Object[] values;
            int size = 0;
            int capacity = 10;

            ArrayList() {
                values = new Object[capacity];
            }

            public void add(Object object) {
                if (capacity > size) {
                    values[size++] = object;
                } else {
                    capacity *= 2;
                    Object[] newArray = new Object[capacity];
                    //copy old array into new array
                    for (int index = 0; index < values.length; index++) {
                        newArray[index] = values[index];
                    }
                    newArray[size++] = object;
                    values = newArray;
                }
            }
        }

        //to store multiple elements with shortage of memory
        ArrayList arrayList = new ArrayList();//ds creation
        arrayList.add(100);
        arrayList.add(200);
        arrayList.add("abc");
        arrayList.add(100);
        arrayList.add(100);
        arrayList.add(100);
        arrayList.add(100);
        arrayList.add(100);
        arrayList.add(100);
        arrayList.add(100);
        arrayList.add(100);
        arrayList.add(100);
        arrayList.add(100);
        arrayList.add(100);
        arrayList.add(100);
        arrayList.add(100);
        arrayList.add(100);
        arrayList.add(100);
        arrayList.add(100);
        arrayList.add(100);
        arrayList.add(100);
        arrayList.add(100);
        System.out.println("Size of the container "+arrayList.size);
        System.out.println("capacity of the container "+arrayList.capacity);


    }
}

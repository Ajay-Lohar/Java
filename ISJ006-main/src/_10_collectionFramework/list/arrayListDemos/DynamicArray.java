package _10_collectionFramework.list.arrayListDemos;

public class DynamicArray {
    Object[] array;
    private int capacity = 10;
    private int size = 0;

    public DynamicArray() {
        array = new Object[capacity];
    }

    public DynamicArray(int initialCapacity) {
        if (initialCapacity > 0 && initialCapacity < Integer.MAX_VALUE) {
            this.capacity = initialCapacity;
            array = new Object[this.capacity];
        }
    }

    public void add(Object element) {
        if (size <= capacity) {
            array[size++] = element;
        } else {
            int newCapacity = 2 * capacity;
            Object[] newArray = new Object[newCapacity];
            capacity = newCapacity;
            for (int index = 0; index < array.length; index++) {
                newArray[index] = array[index];
            }
            newArray[size++] = element;
            array = newArray;
        }
    }

    int size() {
        return size;
    }

    boolean isEmpty() {
        return size == 0;
    }
}

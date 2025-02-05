package collectionFramework.listImpl;

public class Demo1LinkedList {
    public static void main(String[] args) {
        //single linked list
        class Node {
            int data;
            Node next;

            Node(int data) {
                this.data = data;
            }
        }
        class LinkedList {
            Node first = null;
            Node last = null;
            int size = 0;

            void add(int element) {
                Node newNode = new Node(element);
                size++;
                if (first == null) {
                    first = last = newNode;
                } else {
                    last.next = newNode;
                    last = newNode;
                }
            }

            void print() {
                Node temp = first;
                while (temp != null) {
                    System.out.println(temp.data + " -> ");
                    temp = temp.next;
                }
            }
        }

        LinkedList linkedList = new LinkedList();
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);
        linkedList.add(40);
        linkedList.add(50);
        linkedList.print();
        System.out.println("Size of the list is "+linkedList.size);
    }
}

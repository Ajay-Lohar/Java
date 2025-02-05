package _7_stringHandling;

public class Demo9StringMethodsSplit {
    public static void main(String[] args) {
        String names = "Rohit Swapnil Rahul Onkar Rohan Aakash Akshay";
        String[] nameList = names.split(" ");
        for (String name:nameList) {
            System.out.println(name);
        }

    }
}

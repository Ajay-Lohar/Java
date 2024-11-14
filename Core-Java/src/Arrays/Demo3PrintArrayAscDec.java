package Arrays;

public class Demo3PrintArrayAscDec {
    public static void main(String[] args) {
        int[] array = {39,89,45,32,23};


        // asc order( as it is )
        System.out.println("Asc Order");

        for (int i = 0; i < array.length ; i++) {
            System.out.println(array[i]);
        }

        System.out.println("dec Order");
        // dec(Reverse the order)
        for (int i = array.length-1;i>=0 ;i--){
            System.out.println(array[i]);

        }
    }
}

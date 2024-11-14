package Collection;

public class Demo01 {
    public static void main(String[] args) {
        int[] arr ={1,3,5,7,9};
        System.out.println("Original Array lenght "+ arr.length);



        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }

        System.out.println(" ");
        //reverse the array
        for (int i = arr.length-1; i >= 0; i--) {
            System.out.print(arr[i]);
        }


    }

}

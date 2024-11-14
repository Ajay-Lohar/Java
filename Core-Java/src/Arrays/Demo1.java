package Arrays;

public class Demo1 {
    public static void main(String[] args) {
        int[] A = {111,34,1,45,76};

//        System.out.println(A[0]);//111
//        System.out.println(A[1]);//34
//        System.out.println(A[2]);//1
//        System.out.println(A[3]);//45
//        System.out.println(A[4]);//76
//        System.out.println(A[4 -1]);//45
//        System.out.println(A[5]);//ArrayIndexOutOfBoundsException

 // Print the all elements in array
        for (int index =0; index <5; index++) {
            System.out.println(" "+ A[index]);
        }

        // Print the all elements using enhanced for loop

        for(int temp : A){
            System.out.println(temp);
        }
    }
}

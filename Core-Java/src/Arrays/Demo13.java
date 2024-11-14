package Arrays;

public class Demo13 {
    public static void main(String[] args) {
        int [][] array ={
                {1,2,3},
                {1,2,3,4},
                {1,2,3,4,5},
                {1,2,3,4,5,6},
        };


//        for (int row =0 ; row < array.length; row++){
//            for (int col =0 ; col < array[row].length; col++){
//                System.out.print(array[row][col]);
//            }
//            System.out.println();
//        }


        // for inhance loop
        for (int[] tempArray :array){
            for(int temp :tempArray){
                System.out.print(temp+" ");
            }
            System.out.println();
        }
    }
}

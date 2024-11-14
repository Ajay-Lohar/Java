package Arrays;

public class Demo2 {
    public static void main(String[] args) {
        int[] array ={13,49,56,78,33};
        int sum =0;


        // using traditional for loop
//        for(int i =0 ;i< array.length; i++){
//            sum = sum+ array[i];
//
//        }
//        System.out.println("traditional way sum calculate " +sum);
        //enhanced for loop
        for (int temp :array){
            sum = sum + temp;
            //sum += temp
        }
        System.out.println( "total sum of this array "+sum);

    }
}

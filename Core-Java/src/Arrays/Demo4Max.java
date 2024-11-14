package Arrays;

public class Demo4Max {
    public static void main(String[] args) {
        int[] array ={2,3,4,5,1,223,54,908,233332};
        int maximum =Integer.MIN_VALUE;

        for (int temp: array){
            if (maximum < temp){
                maximum = temp;
            }
        }
        System.out.println("maximum number of given array\t"+maximum);
    }
}

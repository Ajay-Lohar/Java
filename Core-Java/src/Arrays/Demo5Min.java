package Arrays;

public class Demo5Min {
        public static void main(String[] args) {
            int[] array ={2,3,4,5,1,223,-54,908,233332};
            int minimum =Integer.MAX_VALUE;

            for (int temp: array){
                if (minimum > temp){
                    minimum = temp;
                }
            }
            System.out.println("maximum number of given array\t"+minimum);
        }
}



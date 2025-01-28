package WriteenTest.ThinketiveSetD;

import java.util.Arrays;

public class Q2Array {
//   int [] arr = {1,2,3,4,5,6};
//    given array output is max int is first and min int is second element
//   Output = {6,1,5,2,4,3};
public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int n = arr.length;
        int[] result = new int[n];

        // Sort the array (already sorted in given input, but needed for generic cases)
        Arrays.sort(arr);

        int left = 0;          // Pointer to the smallest element
        int right = n - 1;     // Pointer to the largest element
        int index = 0;

        // Fill the result array with alternating max and min values
        while (left <= right) {
            if (index % 2 == 0) {
                result[index++] = arr[right--]; // Place max element
            } else {
                result[index++] = arr[left++];  // Place min element
            }
        }

        // Print the result
        System.out.println("Rearranged array: " + Arrays.toString(result));
    }


}



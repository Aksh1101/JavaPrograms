package assignment5;

import java.util.Arrays;

public class problem189 {
    public static void main(String[] args) {
        int [] nums = {1,2,3,4,5,6,7};
        int k = 3;
        k = k % nums.length; // this is to get index inbound
//        if (k < 0){
//            k += nums.length;
//        } this is only if we wanted to rotate in counter clock wise direction
        reverse(nums, 0, nums.length-1);
        reverse(nums, k, nums.length-1);
        reverse(nums, 0, k-1);

        // and if the array is rotated as the number of element times than array as return the original array
        // here we are reversing the array first
        // and then reversing the second half
        // and then the first half of the array


        System.out.println(Arrays.toString(nums));

    }
    static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}

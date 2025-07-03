package arrays;

public class MaxInRange {
    public static void main(String[] args) {
        int [] arr = {1, 23, 4 ,35,87,45};
        System.out.println(maxInRange(arr, 2 , 5));

    }
// here array is not empty and we are finding maximum value in between index 0-4
    // also work on edge cases, like array being null

    static int maxInRange(int[] arr , int start , int end) {

        if (start >= end) {
            return -1;
        }

        if (arr == null){
            return -1;
        }

        int maxVal =  arr[start];
        for(int i = start; i < end; i++) {
            if(arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }
        return maxVal;

    }
}


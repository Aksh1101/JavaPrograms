package sorting;

import java.util.Arrays;

public class bubbleSort {
    // Also known as sinking sort and exchange sort
    public static void main(String[] args) {
        int [] arr = {0,1,35,-64,5,67,33,7,42,-98};
        sort(arr);
        System.out.println(Arrays.toString(arr));


    }
    static void sort(int[] arr) {
        boolean swapped ;
        for (int i = 0; i < arr.length ; i++) {
            swapped = false;
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) { // for descending order change the comparison sign
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;
                }
            }
            // if you did not swap for the particular value of i,
            // it means the array is sorted, so stop the program
            if (!swapped) {
                break;
            }
        }
    }
}

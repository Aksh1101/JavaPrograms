package sorting;

import java.util.Arrays;

public class cyclicSort {
    public static void main(String[] args) {
        int [] arr = {3,5,2,1,4};
        // if we have given 5 elements than it has not exceeds 5 for the value of elemnet
        // then we use this 
        sort(arr);
        System.out.println(Arrays.toString(arr));
        // when given numbers from range 1 to N use cyclic sort
    }
    static void sort(int[] arr){
        int i = 0;
        while (i < arr.length){
            int correctIndex = arr[i]-1;
            if (arr[i] != arr[correctIndex]){
                swap(arr, i, correctIndex);
            } else {
                i++;
            }
        }
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}

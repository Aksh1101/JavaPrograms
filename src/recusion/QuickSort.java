package recusion;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int [] arr = {4,2,67,34,72,8,3};
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));

        // if i use Array.sort(arr),
        // then it going to use dual pivot quick sort

    }
    static void quickSort(int[] arr,int low,int high){
        if(low>=high){
            return;
        }
        int start =  low;
        int end = high;
        int mid = (end-start)/2;
        int pivot = arr[mid];

        // condition for swapping
        while(start<=end){
            while (arr[start]<pivot){
                start++;
            }
            while (arr[end]>pivot){
                end--;
            }
            // swapping
            if(start<=end){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }
        // now my pivot is at correct index, please sort two halves now
        quickSort(arr,low,end);
        quickSort(arr,start,high);
    }
}

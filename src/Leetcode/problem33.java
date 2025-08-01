package Leetcode;

import java.util.Arrays;

public class problem33 {
    // search in rotated sorted array
    // approach 1
    /* find the pivot,
    pivot - largest number from where your next number is ascending
    then search in first half from 0 to pivot
    else in second half pivot+1 to end
     */
    // another way of doing this is with recursion
    public static void main(String[] args) {

        int [] arr = {5,6,7,0,1,2,4};
        int target = 0;
        System.out.println(search(arr,target));

    }
    static int search(int[] arr, int target){
        int pivot = findPivot(arr);
        // if u dont have the pivot this means array is not rotated
        if(pivot == -1){
            // just do normal binary search
            return binarySearch(arr,target,0,arr.length-1);
        }
        // if pivot is found , we have two ascending sorted arrays
        if (arr[pivot] == target){
            return pivot;
        }
        if (target >= arr[0]) {
            return binarySearch(arr,target,0,pivot-1);
        }else {
            return binarySearch(arr,target,pivot+1,arr.length-1);
        }

    }
    static int binarySearch(int[] arr ,int target, int start, int end){

        while(start <= end){
            // find a middle element
            int mid = start + (end - start)/2;

            if(target < arr[mid]){
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else
                return mid;
        }
        return -1;
    }
    // this will not work for duplicate values
    static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            // 4 cases over here
            int mid = start + (end - start) / 2;
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            if (arr[mid] <= arr[start]) {
                end = mid -1;
            } else  {
                start = mid + 1;
            }
        }
        return -1;
    }
    // for duplicate
    static int findPivotWithDuplicates(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            // 4 cases over here
            int mid = start + (end - start) / 2;
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            // if elements at a middle, start, end are equal then just skip duplicates
            if (arr[mid] == arr[start] &&  arr[mid] == arr[end]) {
                // skip the duplicate
                // Note what if these elements at start and end were the pivots?
                // check if start is pivot
                if (arr[start] > arr[start +1]){
                    return start;
                }
                start++;
                // check end is pivot or not
                if(arr[end] < arr[end-1]){
                    return end -1;
                }
                end++;
            }
            // the left side is sorted so pivot should be in right
            else if (arr[start]< arr[mid] || arr[mid] == arr[start] && arr[mid] > arr[end]){
                start = mid + 1;
            }else  {
                end = mid - 1;
            }
        }
        return -1;
    }

}

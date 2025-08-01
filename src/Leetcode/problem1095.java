package Leetcode;

public class problem1095 {
    // will submit it later on leetcode
    // approach -
    // find the peak element
    // binary search in an ascending array indexes- 0 to peak value index
    // or in descending array indexes - peak value index to last
    public static void main(String[] args) {
        int[] arr = { 1,2,3,4,5,3,1};
        int target = 3;
        int ans = search(arr,target);
        System.out.println(ans);

    }
    static int search(int[] arr,int target){
        int peak = peakIndexInMountainArray(arr);
        int firstTry = orderAgnostics(arr, target,0,peak);
        if (firstTry != -1) {
            return firstTry;
        }
        return orderAgnostics(arr,target,peak+1, arr.length-1);
        // peak wale function se humne peak nikaal li
        // and then humne orderAgnotics wale function ko use kiya half and half area mai target ko find karne ka

    }
    static int orderAgnostics(int[] arr, int target, int start , int end) {
        // find whether the array is sorted in ascending or descending
        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else if (target > arr[mid]) {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else if (target < arr[mid]) {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }

    static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                // you are in the decreasing part of an array
                // this may be the answer but look left
                // this is why end != mid -1
                end = mid;
            }  else  {
                // you are in the ascending part of the array
                start = mid + 1;
            }
        }
        // in the end, start == end and pointing to the largest number because of the 2 checks above
        // start and are always trying to find max element in above 2 checks
        // hence when they are pointing to just one element then it will be the answer
        return start ;

    }

}

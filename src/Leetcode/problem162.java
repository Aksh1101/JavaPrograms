package Leetcode;

public class problem162 {
    // this has the exact same solution with peak index in mountain array
    // problem 852
    // here the array is zigzag we can say it is like this /\/\/
    public static void main(String[] args) {
        int[] arr = {1,2,1,3,5,6,4};
        int ans = peakIndexInArray(arr);
        System.out.println(ans);


    }
    static int peakIndexInArray(int[] arr) {
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
        // in the end , start == end and pointing to the largest number because of the 2 checks above
        // start and are always trying to find max element in above 2 checks
        // hence when they are pointing to just one element then it will be the answer
        return start ;

    }
}

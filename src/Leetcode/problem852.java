package Leetcode;

public class problem852 {
    public static void main(String[] args) {
        // here we are talking about the mountain array,
        // which is increased first, and the decrease
        // also known as a bitonic array
        // finds the index of the larget number in this array
        int [] arr = {3,5,7,9,10,90,100,130,140,170,142,121,111,98,65,43,32,21,1};
        //int [] arr = {0,1,0};
        int answer = peakIndexInMountainArray(arr);
        System.out.println(answer);



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

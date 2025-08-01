package binarySearch;

public class binarySearch1 {
    public static void main(String[] args) {
        int [] arr = {99,87, 76 ,65 ,54 ,43 ,32 ,21 ,12 ,2};
        // for descending order
        int target = 32;
        int ans = biSearch(arr,target);
        System.out.println(ans);
    }
    public static int biSearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start)/2;
            if (target < arr[mid]) {
                start = mid + 1; // here is the change
            } else if (target > arr[mid]) {
                end = mid - 1; // here is the change
            } else  {
                return mid;
            }
        }
        return -1;
    }
}

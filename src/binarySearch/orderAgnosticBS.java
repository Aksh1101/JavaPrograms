package binarySearch;

public class orderAgnosticBS {
    // here we first find out it is ascending or descending
    public static void main(String[] args) {

        //int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int [] arr = { 9, 8, 7, 6, 5, 4, 3, 2, 1 };
        int target = 7;
        int ans = orderAgnosticbs(arr, target);
        System.out.println(ans);


    }

    static int orderAgnosticbs(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
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

}


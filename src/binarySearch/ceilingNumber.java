package binarySearch;

public class ceilingNumber {
    public static void main(String[] args) {
        // ceiling = smallest element in an array greater or equal to a target element
        int [] arr = {12, 34 , 56 ,78, 89, 98, 99,123,135,167};
        // find ceiling of
        int target = 87;
        int ans = CeilingNumber(arr,target);
        System.out.println(ans); // printing then number from an array
    }

    static int CeilingNumber(int[] arr ,int target){
        // but what if the target is greater than the greatest number in the array
        if (target > arr [arr.length - 1]){
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;
        while(start < end){
            // find a middle element
            int mid = start + (end - start)/2;

            if(target < arr[mid]){
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else
                return mid;
        }
        return arr[start];
    }

}

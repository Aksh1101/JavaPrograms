package binarySearch;

public class binarySearch0 {
    public static void main(String[] args) {
       // int [] arr = {12, 34 , 56 ,78, 89, 98, 99,123,135,167};
        // this is for an ascending order sorted array
        int [] arr = {0,1,2,4,2,1};
        int target = 3;
        int ans = bSearch(arr,target);
        System.out.println(ans);


    }
    // return the index of the target
    // return -1 if it not exists
    static int bSearch(int[] arr ,int target){
    int start = 0;
    int end = arr.length - 1;
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
}

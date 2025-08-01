package binarySearch;

public class floorNumber {
    public static void main(String[] args) {
        // ceiling = biggest element in an array smaller or equal to a target element
        int [] arr = {12, 34 , 56 ,78, 89, 98, 99,123,135,167};
        // find a floor of
        int target = 111;
        int ans = FloorNumber(arr,target);
        System.out.println(ans); // printing then number from an array
    }

    static int FloorNumber(int[] arr ,int target){
        // but what if the target is smaller than the smallest number in the array
        if (target < arr [1]){
            return -1;
        }// thia is giving -1 without this if so this is optional
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
        return arr[end];
    }

}

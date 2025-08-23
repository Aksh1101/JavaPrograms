package recusion;

public class binarySearch {
    public static void main(String[] args) {
        int [] arr = {2,34,56,78,89,90};
        int target = 56;
        System.out.println(search(arr,target,0,arr.length-1));

    }
    static int search(int [] arr , int target ,int start , int end){

        if(start > end){
            return -1;
        }
        int mid = (start + end)/2;
        if(arr[mid] == target){
            return mid;
        }
        if(arr[mid] < target){
            return search(arr ,target , start, mid-1);
        }
        return search(arr ,target , mid+1 , end);
    }
}

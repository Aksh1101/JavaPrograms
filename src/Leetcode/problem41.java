package Leetcode;

public class problem41 {
    public static void main(String[] args) {
        int [] nums = {3,4,-1,1};
        System.out.println(firstMissingNumber(nums));

    }
    static int firstMissingNumber(int[] nums) {
        int i = 0;
        while (i < nums.length){
            int correctIndex = nums[i]-1;
            if ( nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[correctIndex]){
                swap(nums, i, correctIndex);
            }
            else {
                i++;
            }
        }
        // search for first positive missing number
        for(int index = 0; index < nums.length; index++){
            if (nums[index] != index+1){
                return index + 1;
            }
        }
        return nums.length + 1;
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}

package assignment6;

import java.util.Arrays;

public class problem167 {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(search(nums, target)));

    }
    public static int[] search(int[] nums, int target){
        int left = 0;
        int right = nums.length-1;
        while(left < right){
            int sum = nums[left] + nums[right];
            if(sum< target){
                left++;
            }else if(sum > target){
               right--;
            }else{
                return new int[]{left+1,right+1};
            }
        }
        return new int[]{-1,-1};
    }
}

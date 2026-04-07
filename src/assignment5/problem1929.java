package assignment5;

import java.util.Arrays;


public class problem1929 {
    public static void main(String[] args) {
        int [] nums = {1,2,3};
        int n = nums.length;
        int [] ans = new int[nums.length*2];

        for  (int i = 0; i < n; i++) {
            ans[i] = nums[i];
            ans[i+n] = nums[i];

        }
        System.out.println(Arrays.toString(ans));
    }
}

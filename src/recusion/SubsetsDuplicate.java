package recusion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetsDuplicate {
    public static void main(String[] args) {
        int[] arr = {1,2,2};
        List<List<Integer>> ans = subsetDuplicate(arr);
        for (List<Integer> list : ans) {
            System.out.println(list);
        }

    }
    static List<List<Integer>> subsetDuplicate(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> outer  = new ArrayList<>();

        outer.add(new ArrayList<>());
        int start = 0;
        int end = 0;

        for (int i = 0; i < nums.length; i++) {
            start = 0;
            // if my current and previous element is same , start = end +1
            if (i>0 && nums[1] == nums[i-1]) {
                start = end + 1;
            }
            end = outer.size()-1;
            int n = outer.size();
            for (int j = start; j < n; j++) {
                List<Integer> internal = new ArrayList<>(outer.get(j));
                internal.add(nums[i]);
                outer.add(internal);
            }
        }
        return outer;
    }
}

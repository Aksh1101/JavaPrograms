package recusion;

import java.util.ArrayList;
import java.util.List;

public class Subset {
    public static void main(String[] args) {
        int [] arr = {1,2,3};
        System.out.println(subsets(arr));
        // another way of printing
        List<List<Integer>> ans = subsets(arr);
        for (List<Integer> list : ans) {
            System.out.println(list);
        }

        // time complexity - O(N * 2^N)
        // space complexity - O(2^N * N)

    }
    static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> outer  = new ArrayList<>();

        outer.add(new ArrayList<>());

        for (int num : nums) {
            int n = outer.size();
            for (int i = 0; i < n; i++) {
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
            }
        }
        return outer;
    }
}

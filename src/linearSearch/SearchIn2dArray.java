package linearSearch;

import java.util.Arrays;

public class SearchIn2dArray {
    public static void main(String[] args) {
        int [][] arr = {
                {1,3,4},
                {13,56,37,8},
                {34,56,78,62},
                {32,45,98,54}
        };
        int target = 56;
        int[] ans = search(arr , target); // to return indexes in an array
        System.out.println(Arrays.toString(ans));
    }
    static int[] search(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    return new int[]{row ,col};
                }
            }
        }
        return new int[]{-1,-1};
    }
}

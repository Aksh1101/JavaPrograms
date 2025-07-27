package linearSearch;

import java.util.Arrays;

public class MaxIn2dArray {
    public static void main(String[] args) {
        int [][] arr = {
                {1,3,4},
                {13,56,37,8},
                {34,56,78,62},
                {32,45,98,54}
        };
        System.out.println(max(arr));
        System.out.println(Integer.MIN_VALUE);
    }

    static int max(int[][] arr) {
        int max = Integer.MIN_VALUE; // or arr[0][0]
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] > max) {
                    max = arr[row][col];
                }
            }
        }
        return max;
    }
}

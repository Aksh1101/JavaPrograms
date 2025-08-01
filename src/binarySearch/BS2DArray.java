package binarySearch;

import java.util.Arrays;

public class BS2DArray {
    // here the matrix is sorted row wise and column wise as well
    // so wee need to find the target in that
    public static void main(String[] args) {
        int [][] arr = {
                {23,45,67,77},
                {34,56,73,81},
                {45,65,87,89},
                {54,76,92,99}
        };
        // here the matrix is not strictly sorted
        // it is sorted in row and column wise manner
        int target = 87;
        int [] answer = SearchIn2D(arr,target);
        System.out.println(Arrays.toString(answer));

    }
    static int[] SearchIn2D(int[][]arr ,int target){
        int row = 0;
        int col = arr.length - 1; // order of matrix should be n * n
        // if the matrix is of n*m then use arr[0].length-1

        while(row < arr.length && col >= 0){
            if(arr[row][col] == target){
                return new int[]{row, col};
            }
            if(arr[row][col] < target){
                row++;
            }
            else {
                col--;
            }
        }
        return new int[]{-1,-1};
    }
}

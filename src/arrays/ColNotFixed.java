package arrays;

public class ColNotFixed {
    public static void main(String[] args) {
        int[][] arr = {
                {0,1,7,9},
                {3,8},
                {2,4,6}
        };
        for(int row = 0; row <arr.length; row++){
            for(int col = 0; col <arr[row].length; col++){
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
    }
}

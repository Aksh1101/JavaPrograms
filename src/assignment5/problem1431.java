package assignment5;

import java.util.Arrays;

public class problem1431 {
    public static void main(String[] args) {
        int[] candies = {2,3,5,1,3};
        int extra = 3;
        int max = 0 ;
        boolean[] result = new boolean[candies.length];
        for (int i = 0; i < candies.length; i++) {
            if(candies[i] > max){
                max = candies[i];
            }
            candies[i] += extra;
            if(candies[i] >= max){
                result[i] = true;
            }
        }
        System.out.println(Arrays.toString(result));
    }
}

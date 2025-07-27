package Leetcode;

public class problem1295 {
    public static void main(String[] args) {
        int [] nums = {12, 365 , 24, 6 , 7896};
        System.out.println(findNumbers(nums));
        //System.out.println(digits2(72778));

    }
    static int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (even(num)){
                count++;
            }
        }
        return count;

    }
    // function to check, a number contains even digits or not
    static boolean even(int num) {
        int numberOfDigits = digits(num);
//        if (numberOfDigits % 2 == 0) {
//            return true;
//        }
//        return false;
        return numberOfDigits % 2 == 0; // this is the shortcut

    }

    // count number of digits
    static int digits(int num) {
        if (num < 0) { // if the number is negative
            num = num * -1;
        }
        if (num == 0) {
            return 1;
        }
        int count = 0;
        while (num > 0) {
            count++;
            num /= 10;
        }
        return count;
    }
    // another way of counting the digits
    static int digits2(int num) {
        return (int) Math.log10(num) + 1;
    }
}

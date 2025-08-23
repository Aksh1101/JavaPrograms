package bitwiseOperators;

public class NoOfDigits {
    public static void main(String[] args) {
        // find the number of digits in any base
        int n = 10;
        int base = 2;

        int ans = (int)(Math.log(n)/Math.log(base)) + 1;
        // this is done for the base if you have different base then divide with the log of that
        System.out.println(ans);
        // complexity is log n , number of digits is the number of complexity
    }
}

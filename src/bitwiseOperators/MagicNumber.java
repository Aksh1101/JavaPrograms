package bitwiseOperators;

public class MagicNumber {
    public static void main(String[] args) {
        // find the nth  magic number
        /*  1 = 001 = 5^1 = 5
            2 = 010 = 5^2 = 25
            3 = 011 = 5^2 + 5^1 = 30
         */
        int n = 6;

        int ans = 0;
        int base = 5;
        while (n > 0) {
            int lastDigit = n & 1;
            n = n >> 1;
            ans  += lastDigit * base;
            base = base * 5;
        }
        System.out.println(ans);
    }

}

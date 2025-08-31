package recusion;

public class palindrome {
    public static void main(String[] args) {
        System.out.println(palin(1234321));
        // this is a program to check whether a number is palindrome or not


    }
    static int rev(int n){
        int digits = (int)(Math.log10(n)+1);
        return helper(n,digits);
    }
    private static int helper(int n, int digits) {
        if(n%10==n){
            return n; // if a number is a one-digit number return the number itself
        }
        int rem = n%10;
        return rem * (int)(Math.pow(10,digits-1)) + helper(n/10, digits-1);
    }
    static boolean palin(int n){
        return n == rev(n);
    }
}

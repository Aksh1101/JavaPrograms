package recusion;

public class reverse {
    public static void main(String[] args) {
        Reverse(1324);
        System.out.println(sum);
        // for method 1 we used to print the sum

        // answer through second method
        System.out.println(rev(1456));

    }
    // this is the first way to do it
    static int sum = 0;
    static void Reverse(int n){
        if(n==0){
            return;
        }
        int rem = n%10;
        sum = sum * 10 + rem;
        Reverse(n/10);
    }

    // method 2
    static int rev(int n){
        // sometimes there is a need for additional function in argument
        // in that case make another function
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

}

package others;

public class SumOfNOdd {
    public static void main(String[] args) {
        int n = 5;
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += 2*i-1;
        }
        System.out.println(sum);
        System.out.println(oddSum(4));
    }
    // recursive method
    static int oddSum(int n){
        if(n==0){
            return 0;
        }
        return 2*n-1 + oddSum(n-1);
    }
}

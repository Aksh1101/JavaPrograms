package others;

public class sumOfNEvens {
    public static void main(String[] args) {
        int n = 5;
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += 2*i;
        }
        System.out.println(sum);
        System.out.println(evenSum(n));
    }
    static int evenSum(int n){
        if(n==0){
            return 0;
        }
        return 2*n+evenSum(n-1);
    }
}

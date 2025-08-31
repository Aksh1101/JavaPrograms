package recusion;

public class factorial {
    public static void main(String[] args) {
        // factorial of a number
        System.out.println(fact(5));


    }
    static int fact(int n){
        if(n==1){
            return 1;
        }
        return n * fact(n-1);
    }
}

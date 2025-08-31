package recusion;

public class SumOfNto1 {
    // here we gonna do it the sum of the number given till 1
    public static void main(String[] args) {
        System.out.println(sum(4));

    }
    static int sum(int n){
        if (n==0)
            return 0;
        return n+sum(n-1);
    }
}


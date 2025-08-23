package bitwiseOperators;

public class oddEven {
    public static void main(String[] args) {
        // find the number is odd or not
        int n = 78;
        System.out.println(isOdd(n));

    }
    static boolean isOdd(int n){
        return (n & 1) == 1;
        // for even uss == 0
    }
}

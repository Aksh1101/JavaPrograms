package bitwiseOperators;

public class powerOf2 {
    public static void main(String[] args) {
        // find out the number os power of two or not
        int n = 32; // note - fix for n = 0
        boolean ans = (n & (n-1)) == 0;
        System.out.println(ans);
    }
}

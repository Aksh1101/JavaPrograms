package bitwiseOperators;

public class GCD {
    public static void main(String[] args) {
        System.out.println(gcd(105,224));

    }
    static int gcd(int a,int b){
        if(a == 0){
            return b;
        }
        return gcd(b%a,a);
    }

}

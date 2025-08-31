package recusion;

public class digitProduct {
    public static void main(String[] args) {
        System.out.println(product(999));

    }
    static int product(int n){
//        if(n==1){
//            return 1;
//        } this will give stackoverflow error
        if(n%10 == n){
            return n;
        }
        return (n%10) * product(n/10);
    }
}

package recusion;

public class Nto1 {
    // print all the numbers 5 to 1
    public static void main(String[] args) {

        num(5);

    }
    static void num(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        num(n-1);

    }
}

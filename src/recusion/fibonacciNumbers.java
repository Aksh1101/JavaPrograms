package recusion;

public class fibonacciNumbers {
    public static void main(String[] args) {
        // find nth fibonacci number
        // System.out.println(fibo(10));

//        for(int i = 1; i < 11; i++ ){
//            System.out.println(fiboFormula(i));
//        }

        System.out.println(fiboFormula(50));


    }
    static int fiboFormula(int n ){
         return (int) (Math.pow(((1 + Math.sqrt(5)) / 2), n) / Math.sqrt(5));

    }



    static long fibo(int n){
        // base condition
        if(n < 2){
            return n;
        }
        return fibo(n-1) + fibo(n-2);
    }
}

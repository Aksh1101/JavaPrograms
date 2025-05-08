package functions;

public class Swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 90;

        // swapping the numbers
//        int temp = a;
//        a = b;
//        b = temp;
//
//        System.out.println("a = " + a);
//        System.out.println("b = " + b);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("After Swapping ");
        swap(a,b);
    }


    // now do this in functions

    static  void swap(int num1, int num2){
        int temp = num1;
        num1  = num2 ;
        num2 = temp;
        System.out.println("a = " + num1);
        System.out.println("b = " + num2);

    }
}

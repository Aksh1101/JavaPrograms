package oops;

import java.util.ArrayList;
import java.util.function.Consumer;

public class LambdaFunctions {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            arr.add(i+1);
        }

        arr.forEach((item) -> System.out.println(item*item)); // lambda function
        // another way of doing the above

        Consumer<Integer> func = (item) -> System.out.println(item+item);
        arr.forEach(func);

        Operation product = (a,b) -> a*b;
        Operation average = (a,b) -> (a+b)/2;


        LambdaFunctions myCalculator = new LambdaFunctions();
        System.out.println(myCalculator.operate(3,6,product));
        System.out.println(myCalculator.operate(37,69,average));
    }
    private int operate(int a,int b, Operation Op){
        return Op.operation(a, b);
    }
}
// when we have multiple parameter then we can use an interface
interface Operation{
    int operation(int a, int b);
}


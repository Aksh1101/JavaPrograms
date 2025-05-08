package functions;

import java.util.Arrays;

public class functionOverloading {
    public static void main(String[] args) {
        fun(69);
        //fun("Java");
        //fun(34,35);
       // int ans = sum(2,5);
       // System.out.println("sum is " + ans);
        //sum(22,33,14);
        demo("Aksh","Akshat","Hitler","Specy");
    }
    static void fun(int a){
        System.out.println("First one");
        System.out.println(a);
    }

    static void fun(String name){
        System.out.println("Second one");
        System.out.println(name);
    }

    static void fun(int b , int c){
        System.out.println("Third one");
        System.out.println(b + " " + c);
    }
    static int sum(int a , int b){
        return a + b;
    }
    static int sum (int a , int b, int c){
        return a + b + c;
    }
    static void demo(int...v){
        System.out.println(Arrays.toString(v));
    }
    static void demo(String...v){
        System.out.println(Arrays.toString(v));
    }
}
// two or more function of the same name can exist if the parameters are different
// no. of arguments should be different if parameter is same
// otherwise it will give a error
// on compile time it will be decided which function to run
// VarArgs parameter cannot be empty it shows error and this is call ambiguity


package functions;

import java.util.Arrays;

public class VarArgs  {
    public static void main(String[] args) {
      fun(2,4,5,6,7,8,65,56);
      string("sun","A",":","moon");
      multiple(2,3,"prime");
      // prints out an array
    }

    static void fun(int...v){
        System.out.println(Arrays.toString(v));
    }
    static void string(String...s){
        System.out.println(Arrays.toString(s));
    }
    static void multiple(int a , int b, String...s){
    }// here variable length argument should be initialized at the end
    // If did in between then how would the lats one be passed
}





// VarAgrs - Variable length Arguments
// when u create a method that takes variable number of arguments
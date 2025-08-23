package recusion;

public class recursionExample {
    public static void main(String[] args) {
        // write a function that takes a number and prints it
        // prints the first 5 numbers: 1,2,3,4,5
        print(1);
        // in the numbers example we have called function in other function to work out
        // but it is not possible when i have to work with large numbers
        // so recursion is basically call the function in its own body

    }
    static void print(int n ){
        if(n==5){ // this is a base condition in recursion
            System.out.println(n);
            return; // this is done so that it does not recurse infinite time
        }
        System.out.println(n);
        print(n + 1); // this is the last function call
        // so this is the tail recursion


        // if you are calling  a function again and again  , you can treat it as a separate call in the stack
        // every time it will take separate memory when called
    }

}

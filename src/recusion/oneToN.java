package recusion;

public class oneToN {
    public static void main(String[] args) {
       num(5);
        //both(5);
    }
    static void num(int n){
        if(n==0){
            return;
        }
        num(n-1);
        System.out.println(n);
        // here we have called the function first then asked it to print
        // it means it call the other function and wait for the time till the last get printed
        // the caller will print when the called will be printed
        // before we will printing then calling here is opposite
        // first call and wait for it to print then print

    }
    // here we are printing both kind firstly with the print and the recusion call
    // and then the recusion call first and then printing the number
    static void both(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        both(n-1);
        System.out.println(n);
    }
    // time and space complexity is o(n)
}

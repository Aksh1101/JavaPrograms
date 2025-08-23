package recusion;

public class message {
    public static void main(String[] args) {
        // write a function that prints hello world
        // print it 5 times using 1 function only
        msg();
        // here what happens is each function is calling another function
    }
    static void msg(){
        System.out.println("Hello World");
        msg1();
    }
    static void msg1(){
        System.out.println("Hello World");
        msg2();
    }
    static void msg2(){
        System.out.println("Hello World");
        msg3();
    }
    static void msg3(){
        System.out.println("Hello World");
        msg4();
    }
    static void msg4(){
        System.out.println("Hello World");
    }
}

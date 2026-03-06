package oops.polymorphism;

public class Numbers {
    int sum(int a, int b){
        return a+b;
    }

    int sum(int a, int b, int c){
        return a+b+c;
    }
    // this is method overloading when two functions/methods have the same name but the argument is different

    public static void main(String[] args) {
        Numbers numbers = new Numbers();
        System.out.println(numbers.sum(1, 2, 3));
        System.out.println(numbers.sum(1, 2));
    }
}

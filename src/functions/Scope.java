package functions;

public class Scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        {
            //int a = 12; already initialised outside the block so cant be done again
            a = 21; // here we have modified the initial value

        }
        System.out.println(a);
    }

    static void random(){
        int num = 12;
    }
}

// you can only access the variable defined in a function only in the functon,
// not outside of the function , this is what scoping is
// values initialised in a block can be utilised only in the block and also remain in the block
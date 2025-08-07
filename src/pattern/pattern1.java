package pattern;

public class pattern1 {
    public static void main(String[] args) {
        // how to approach
        // 1- Run the outer for loop for the number of lines you want to print
        // that is for the rows
        // 2- how many columns are there with each row or types of elements are there
        // 3- what do you need to print
        // try to find the formula
        pattern(5);

    }
    static void pattern(int n ){
        for(int row = 1; row <= n; row++){
            for(int col = 1; col <= n; col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

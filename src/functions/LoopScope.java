package functions;

public class LoopScope {
    public static void main(String[] args) {
        for(int i = 0; i < 10; i++){
            System.out.println(i);
            // i cant be accessed outside of the loop
            // whatever values which are already defined in scope in the function or  block or in the loop , you cannot initialise them again

        }// anything initialised outside can be used inside the block
        // but anything initialised inside the block cannot be outside
    }
}

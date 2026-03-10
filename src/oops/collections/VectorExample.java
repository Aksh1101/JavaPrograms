package oops.collections;

import java.util.List;
import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        List<Integer> vector = new Vector<>();
        vector.add(1);
        vector.add(2);
        vector.add(3);
        System.out.println(vector);

        // vector is synchronised but arraylist is not
        // arraylist takes less time
        // arraylist support multithreading
        // vector work with single thread other thread have to wait till first finishes

    }
}

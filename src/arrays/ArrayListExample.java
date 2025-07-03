package arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        // syntax
        ArrayList<Integer> list = new ArrayList<Integer>(5  );
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        list.set(4,56);
        list.remove(3);

        System.out.println(list);
        System.out.println(list.contains(4));
        System.out.println(list.get(2));

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arraylist = new ArrayList<Integer>(5  );
        for(int row = 0; row < 5; row++){
            arraylist.add(sc.nextInt());
        }
        System.out.println(arraylist);
    }
}

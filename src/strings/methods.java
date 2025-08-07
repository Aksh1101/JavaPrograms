package strings;

import java.util.Arrays;
import java.util.SortedMap;

public class methods {
    public static void main(String[] args) {
        String name = "Jhon Doe";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toLowerCase());
        String string = "Jhon Doe is a good man ";
        System.out.println(Arrays.toString(string.split(" ")));
    }
}

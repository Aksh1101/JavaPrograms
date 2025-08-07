package strings;

import org.w3c.dom.html.HTMLImageElement;

public class Performance {
    public static void main(String[] args) {
        String series = "";
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a' + i); // here ascii plays the role
            series += ch;
            // every time it will create a new object
            // a, ab,abc,abcd,.........,abcd,,yz
            // these are new objects created on each iteration
            // so much of memory wastage
            // time complexity of O(N2)
        }
        System.out.println(series);
    }
}

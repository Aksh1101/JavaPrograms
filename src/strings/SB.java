package strings;

public class SB {
    // SB as String builder is already a class
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a' + i);
            builder.append(ch);
        }
        System.out.println(builder.toString());
        // here the object is made once,and then only changing the original object
        // all because of the String builder class
        System.out.println(builder.reverse());

    }
}

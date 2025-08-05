package strings;

public class comparison {
    public static void main(String[] args) {
        String a = "Jhon";
        String b = "Jhon";
        // here it will point to the same object in the string pool in the heap memory
        // that's why a == b is true
        // but if we do this
        String c =  new String("Jhon");
        String d = new String("Jhon");
        // this will create two different objects as in the values are same
        // here c == b is false as they are two different objects

        // if u just wanted to only check for the values then
        // use .equals() because it will not care about the objects
        System.out.println(c.equals(d));
        // this will give me true as it only compares the values
    }
}

package strings;

public class palindrome {
    public static void main(String[] args) {
        String str = "Naman";
        System.out.println(isPalindrome(str));
        String string = "abccba";
        System.out.println(isPalindrome(string));
        // single correct is also a palindrome



    }
    static boolean isPalindrome(String str) {
        if (str == null || str.isEmpty()) {
            return true;
        }
        str = str.toLowerCase();
        for (int i = 0; i < str.length() / 2; i++) {
            char start = str.charAt(i);
            char end = str.charAt(str.length() - 1 - i);
            if (start != end) {
                return false;
            }
        }
        return true;
    }
}

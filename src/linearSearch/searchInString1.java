package linearSearch;

import java.util.Arrays;

public class searchInString1 {
    public static void main(String[] args) {
        String name = "William";
        char target = name.charAt(4);
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(search(name, target));
    }

    static Boolean search(String string, char target){
        if (string.isEmpty()){
            return false;
        }
        // here we have converted the string in to the character array
        for(char ch : string.toCharArray()){
            if (ch == target){
                return true;
            }
        }
        return false;

    }

}

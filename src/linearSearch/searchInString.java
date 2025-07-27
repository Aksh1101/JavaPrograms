package linearSearch;

public class searchInString {
    public static void main(String[] args) {
        String name = "William";
        char target = name.charAt(4);
        System.out.println(search(name, target));
    }

    static Boolean search(String string, char target){
        if (string.isEmpty()){
            return false;
        }
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == target) {
                return true;
            }
        }
        return false;

    }
}

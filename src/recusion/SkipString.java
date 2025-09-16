package recusion;

public class SkipString {
    public static void main(String[] args) {
        System.out.println(skipString("bcdsappledhfb"));
        System.out.println(skipAppNotApple("bcdsappledhfb"));
        System.out.println(skipAppNotApple("bcdsapplledhfb"));

    }
    static String skipString(String unprocessed){
        if(unprocessed.isEmpty()){
            return "";
        }
        if(unprocessed.startsWith("apple")){
            return skipString(unprocessed.substring(5));
        }else{
            return unprocessed.charAt(0)+ skipString(unprocessed.substring(1));
        }
    }

    static String skipAppNotApple(String unprocessed){
        if(unprocessed.isEmpty()){
            return "";
        }
        if(unprocessed.startsWith("app") && !unprocessed.startsWith("apple")){
            return skipAppNotApple(unprocessed.substring(3));
        }else{
            return unprocessed.charAt(0)+ skipAppNotApple(unprocessed.substring(1));
        }
    }
}

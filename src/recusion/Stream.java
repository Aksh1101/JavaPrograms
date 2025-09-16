package recusion;

public class Stream {
    // skip a particular character from the string
    public static void main(String[] args) {
        skip("", "baccdah");
        System.out.println(skip1("baddas"));

    }
    static void skip(String processed , String unprocessed){
        if(unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }
        char ch = unprocessed.charAt(0);

        if(ch == 'a'){
            skip(processed,unprocessed.substring(1));
        }else{
            skip(processed + ch,unprocessed.substring(1));
        }
    }

    // when we return a string
    static String skip1(String unprocessed){
        if(unprocessed.isEmpty()){
            return "";
        }
        char ch = unprocessed.charAt(0);

        if(ch == 'a'){
            return skip1(unprocessed.substring(1));
        }else{
            return ch + skip1(unprocessed.substring(1));
        }
    }
}

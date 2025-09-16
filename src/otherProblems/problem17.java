package otherProblems;

import java.util.ArrayList;

public class problem17 {
    // as we have modified the problem 17
    // here we have started the char from 1
    // and also take 3 char for each number
    public static void main(String[] args) {
        pad("","23");

    }
    static void pad(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        int digit = up.charAt(0)-'0'; // this will convert '2' into 2

        for(int i = (digit-1)*3; i < digit*3; i++){
            char ch = (char)('a'+ i);
            pad(p+ch,up.substring(1));

        }
    }

    static ArrayList<String> pad1(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;

        }
        int digit = up.charAt(0)-'0'; // this will convert '2' into 2

        ArrayList<String> list = new ArrayList<>();

        for(int i = (digit-1)*3; i < digit*3; i++){
            char ch = (char)('a'+ i);
            list.addAll(pad1(p+ch,up.substring(1)));
        }
        return list;

    }

    // if you want the count
    static int padCount(String p, String up){
        if(up.isEmpty()){
            return 1;
        }
        int digit = up.charAt(0)-'0'; // this will convert '2' into 2
        int count = 0;

        for(int i = (digit-1)*3; i < digit*3; i++){
            char ch = (char)('a'+ i);
            count = count + padCount(p+ch,up.substring(1));
        }
        return count;
    }
}

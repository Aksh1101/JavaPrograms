package recusion;

import java.util.ArrayList;

public class SubSequence {
    public static void main(String[] args) {
        // this will give me all the subsets of my string
//        subseq("", "abc");
//        System.out.println(subseq1("", "abc"));
        //subseqAscii("","ab");
        System.out.println(subseqAscii1("", "ab"));

    }
    static void subseq(String pro, String unpro) {
        if (unpro.isEmpty()){
            System.out.println(pro);
            return;
        }
        char ch = unpro.charAt(0);
        subseq(pro + ch, unpro.substring(1));
        subseq(pro , unpro.substring(1));
    }
    // if want to return a arraylist

    static ArrayList<String> subseq1(String pro, String unpro) {
        if (unpro.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(pro);
            return list;
        }
        char ch = unpro.charAt(0);
        ArrayList<String> left = subseq1(pro + ch, unpro.substring(1));
        ArrayList<String> right = subseq1(pro , unpro.substring(1));

        left.addAll(right);
        return left;
    }

    // if we wanted to have ascii values to in the sunset
    static void subseqAscii(String pro, String unpro) {
        if (unpro.isEmpty()){
            System.out.println(pro);
            return;
        }
        char ch = unpro.charAt(0);
        subseqAscii(pro + ch, unpro.substring(1));
        // for ascii value
        subseqAscii(pro + (ch+0) , unpro.substring(1));
        subseqAscii(pro , unpro.substring(1));
    }
    static ArrayList<String> subseqAscii1(String pro, String unpro) {
        if (unpro.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(pro);
            return list;
        }
        char ch = unpro.charAt(0);
        ArrayList<String> first = subseqAscii1(pro + ch, unpro.substring(1));
        ArrayList<String> second = subseqAscii1(pro + (ch+0) , unpro.substring(1));
        ArrayList<String> third = subseqAscii1(pro , unpro.substring(1));

       first.addAll(second);
       first.addAll(third);
       return first;
    }
}


package recusion;

import java.util.ArrayList;

public class Permutation {
    public static void main(String[] args) {
       permutation("","abc");
       System.out.println(permutationsList("","xyz"));
       System.out.println(permutationCount("","abc"));

    }
    static void permutation(String processed , String unprocessed){
        if (unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }
        char ch =  unprocessed.charAt(0);

        for (int i = 0; i <= processed.length(); i++){
            String first = processed.substring(0, i);
            String second = processed.substring(i, processed.length());
            permutation(first + ch + second , unprocessed.substring(1));
        }
    }


    static ArrayList<String> permutationsList(String processed , String unprocessed){
        if (unprocessed.isEmpty()){
           ArrayList<String> list = new ArrayList<>();
           list.add(processed);
           return list;

        }
        char ch =  unprocessed.charAt(0);
        ArrayList<String> result = new ArrayList<>();

        for (int i = 0; i <= processed.length(); i++){
            String first = processed.substring(0, i);
            String second = processed.substring(i, processed.length());
            result.addAll(permutationsList(first + ch + second , unprocessed.substring(1)));
        }
        return result;
    }

    // when we just wanted to return the count of the no. of permutations
    static int permutationCount(String processed , String unprocessed){
        if (unprocessed.isEmpty()){
            return 1;
        }
        int count = 0;
        char ch =  unprocessed.charAt(0);

        for (int i = 0; i <= processed.length(); i++){
            String first = processed.substring(0, i);
            String second = processed.substring(i, processed.length());
            count = count + permutationCount(first + ch + second , unprocessed.substring(1));
        }
        return count;
    }


}

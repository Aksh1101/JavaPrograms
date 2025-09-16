package otherProblems;

import java.util.ArrayList;

public class Dice {
    // amazon problem
    // what all possible combination occur in the dice to make 4 as output
    public static void main(String[] args) {
        dice("",4);
        System.out.println(dice1("",5));
        System.out.println(diceCount("",5));
        diceFace("", 5 , 4);
    }
    static void dice(String p, int target){
        if(target == 0){
            System.out.println(p);
            return;
        }
        for (int i = 1; i <= 6 && i <= target; i++) {
            dice(p+i, target-i);
        }
    }

    static ArrayList<String> dice1(String p, int target){
        if(target == 0){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        for (int i = 1; i <= 6 && i <= target; i++) {
            list.addAll(dice1(p+i, target-i));
        }
        return list;
    }

    static int diceCount(String p, int target){
        if(target == 0){
            return 1;
        }
        int count = 0;
        for (int i = 1; i <= 6 && i <= target; i++) {
            count = count + diceCount(p+i, target-i);
        }
        return count;
    }
    // if the die is of greater than 6 faces
    static void diceFace(String p, int target , int face){
        if(target == 0){
            System.out.println(p);
            return;
        }
        for (int i = 1; i <= face && i <= target; i++) {
            diceFace(p+i, target-i , face);
        }
    }
}

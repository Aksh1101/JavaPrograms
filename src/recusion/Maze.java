package recusion;

import java.util.ArrayList;

public class Maze {
    public static void main(String[] args) {
        // find how many ways u can reach from 0,0 to 2,2 in a 3x3 matrix
        System.out.println(count(3,3));
        //path("",3,3);
        System.out.println(pathRet("",3,3));
        System.out.println(pathRetDiagonally("",3,3));

    }
    static int count (int row , int col){
        if(row == 1 || col == 1){
            return 1;
        }
        int left = count(row - 1, col);
        int right = count(row , col-1);

        return left + right;
    }
    // this function will help us to print the actual path
    // we can only right and down
    static void path(String p , int row , int col){
        if(row == 1 && col == 1){
            System.out.println(p);
            return;
        }
        if(row > 1){
            path(p+ 'D' , row - 1 , col);
        }
        if(col > 1){
            path(p+ 'R' , row , col - 1);
        }
    }
    // returning answer in arraylist
    static ArrayList<String> pathRet(String p , int row , int col){
        if(row == 1 && col == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;

        }
        ArrayList<String> list = new ArrayList<>();
        if(row > 1){
            list.addAll(pathRet(p+ 'D' , row - 1 , col));
        }
        if(col > 1){
            list.addAll(pathRet(p+ 'R' , row , col - 1));
        }
        return list;
    }

    // now we can go diagonally also
    static ArrayList<String> pathRetDiagonally(String p , int row , int col){
        if(row == 1 && col == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;

        }
        ArrayList<String> list = new ArrayList<>();
        if(row > 1){
            list.addAll(pathRetDiagonally(p+ 'V' , row - 1 , col));
        }
        if(col > 1){
            list.addAll(pathRetDiagonally(p+ 'H' , row , col - 1));
        }
        if (col > 1 && row > 1) {
            list.addAll(pathRetDiagonally(p+ 'D' , row - 1, col - 1));
        }
        return list;
        // V - Vertical
        // H - horizontal
        // D - diagonal
    }


}

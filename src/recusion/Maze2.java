package recusion;

import java.util.Arrays;

public class Maze2 {
    // can go in all the direction up down left and right
    // this is what backtracking is
    public static void main(String[] args) {
        boolean[][] board = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };
        //path("", board, 0, 0);
        int [][] pathArr = new int [board.length][board[0].length];
        pathPrinting("", board,0,0,1,pathArr);

    }

    static void path(String p, boolean[][] maze, int row, int col) {
        if (row == maze.length - 1 && col == maze[0].length - 1) {
            System.out.println(p);
            return;
        }
        if (!maze[row][col]) {
            return;
        }
        // i am considering this block in my path
        // then in the way marking them as false so i cant come on the cell i started with
        maze[row][col] = false;

        if (row < maze.length - 1) {
            path(p + "D", maze, row + 1, col);
        }
        if (col < maze[0].length - 1) {
            path(p + "R", maze, row, col + 1);
        }
        if (row > 0) {
            path(p + "U", maze, row - 1, col);
        }
        if (col > 0) {
            path(p + "L", maze, row, col - 1);
        }
        // this line where the function will be over
        // so before the function gets removed also remove the changes made byb the function
        maze[row][col] = true;

    }

    // here we're going to print the steps taken
    static void pathPrinting(String p, boolean[][] maze, int row, int col, int step , int[][] path) {
        if (row == maze.length - 1 && col == maze[0].length - 1) {
            path[row][col] = step;
            for(int [] arr : path) {
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }
        if (!maze[row][col]) {
            return;
        }
        // i am considering this block in my path
        // then in the way marking them as false so i cant come on the cell i started with
        maze[row][col] = false;
        path[row][col] = step;

        if (row < maze.length - 1) {
            pathPrinting(p + "D", maze, row + 1, col, step+1, path);
        }
        if (col < maze[0].length - 1) {
            pathPrinting(p + "R", maze, row, col + 1, step+1, path);
        }
        if (row > 0) {
            pathPrinting(p + "U", maze, row - 1, col, step+1, path);
        }
        if (col > 0) {
            pathPrinting(p + "L", maze, row, col - 1, step+1, path);
        }
        // this line where the function will be over
        // so before the function gets removed also remove the changes made byb the function
        maze[row][col] = true;
        path[row][col] = 0;
        // here we have backtrack the path we have made

    }

}


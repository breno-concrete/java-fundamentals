package dev.breno.leetcode.arrayshashing;

import java.util.HashSet;
import java.util.Set;

public class ValidSudoku {

    //https://leetcode.com/problems/valid-sudoku/
    public boolean isValidSudoku(char[][] board) {

        Set<Character> setRow = new HashSet<>();

        for(int row = 0; row <= 6; row = row + 3) {



            for(int column = 0; column <= 6; column = column + 3) {


                Set<Character> set = new HashSet<>();


                for(int i = row; i < row + 3; i++) {

                    for (int j = column; j < column + 3; j++) {
                        if (board[i][j] != '.') {
                            if(!(set.add(board[i][j]))) {
                                return false;
                            }

                        }
                    }
                }
            }
        }

        for (int i = 0; i < 9; i++) {
            Set<Character> set = new HashSet<>();
            for (int j = 0; j < 9; j++) {

                if (board[i][j] != '.') {
                    if(!(set.add(board[i][j]))) {
                        return false;
                    }

                }
            }
        }

        for (int i = 0; i < 9; i++) {
            Set<Character> set = new HashSet<>();
            for (int j = 0; j < 9; j++) {

                if (board[j][i] != '.') {
                    if(!(set.add(board[j][i]))) {
                        return false;
                    }

                }
            }
        }
        return true;





    }
}

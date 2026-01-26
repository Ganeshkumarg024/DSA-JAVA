package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NQueens {
    public static void main(String[] args) {
        int n = 4; // Define board size
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) Arrays.fill(board[i], '.');

        List<List<String>> res = new ArrayList<>();
        backtrack(res, board, 0);

        // Print results in a readable format
        for (List<String> solution : res) {
            for (String row : solution) System.out.println(row);
            System.out.println();
        }
    }

    private static void backtrack(List<List<String>> res, char[][] board, int col) {
        if (col == board.length) {
            res.add(construct(board));
            return;
        }

        for (int row = 0; row < board.length; row++) {
            if (isSafe(board, row, col)) {
                board[row][col] = 'Q';        // Place Queen
                backtrack(res, board, col + 1); // Move to next column
                board[row][col] = '.';        // Backtrack
            }
        }
    }

    private static boolean isSafe(char[][] board, int row, int col) {
        // 1. Check this row on the left side
        for (int i = 0; i < col; i++) {
            if (board[row][i] == 'Q') return false;
        }

        // 2. Check upper diagonal on left side
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') return false;
        }

        // 3. Check lower diagonal on left side
        for (int i = row, j = col; i < board.length && j >= 0; i++, j--) {
            if (board[i][j] == 'Q') return false;
        }

        return true;
    }

    // Helper to convert char[][] board into a List of Strings
    private static List<String> construct(char[][] board) {
        List<String> path = new ArrayList<>();
        for (int i = 0; i < board.length; i++) {
            path.add(new String(board[i]));
        }
        return path;
    }
}
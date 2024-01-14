package ru.artemev.leetcode.tasks;

import java.util.Arrays;

public class TicTacToe {
    /*
    Returns:
    Who did win?

    -1 - game is not finish
    1 - "X" - won
    2 - "O" - won
    0 - draw

    in array:
    0 - empty
    1 - "X"
    2 - "O"
     */
    public static int isSolvedMy(int[][] board) {
        for (int[] line : board) {
            Integer winnerOfLines = getWinnerIfPresent(line);
            if (winnerOfLines != null) {
                return winnerOfLines;
            }
        }
        for (int column : new int[]{0, 1, 2}) {
            int[] arrayColumnElements = getColumn(board, column);
            Integer winnerOfColumn = getWinnerIfPresent(arrayColumnElements);
            if (winnerOfColumn != null) {
                return winnerOfColumn;
            }
        }
        Integer winnerOfDiagonal = getWinnerOfDiagonals(board);
        if (winnerOfDiagonal != null) {
            return winnerOfDiagonal;
        }
        for (int[] lines : board) {
            for (int columns : lines) {
                if (columns == 0) {
                    return -1;
                }
            }
        }
        return 0;
    }

    /*
    Best practice
     */
    public static int isSolvedFromCodeWars(int[][] board) {
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == board[i][1] && board[i][1] == board[i][2] && board[i][0] > 0) {
                return board[i][0];
            }
            if (board[0][i] == board[1][i] && board[1][i] == board[2][i] && board[0][i] > 0) {
                return board[0][i];
            }
            if ((board[1][1] == board[0][0] && board[0][0] == board[2][2] && board[1][1] > 0)
                    || board[1][1] == board[2][0] && board[2][0] == board[0][2] && board[1][1] > 0) {
                return board[1][1];
            }
        }
        if (Arrays.stream(board).flatMapToInt(Arrays::stream).anyMatch(n -> n == 0)) return -1;
        return 0;
    }

    private static Integer getWinnerOfDiagonals(int[][] board) {
        int[] diagonal1 = new int[]{board[0][0], board[1][1], board[2][2]};
        int[] diagonal2 = new int[]{board[0][2], board[1][1], board[2][0]};

        Integer winnerDiagonal1 = getWinnerIfPresent(diagonal1);
        if (winnerDiagonal1 != null) {
            return winnerDiagonal1;
        }
        Integer winnerDiagonal2 = getWinnerIfPresent(diagonal2);
        return winnerDiagonal2;
    }

    private static Integer getWinnerIfPresent(int[] line) {
        if (isAllMatchElement(line, 1)) {
            return 1;
        }
        if (isAllMatchElement(line, 2)) {
            return 2;
        }
        return null;
    }

    private static boolean isAllMatchElement(int[] line, int element) {
        return Arrays.stream(line).allMatch(value -> value == element);
    }

    private static int[] getColumn(int[][] matrix, int column) {
        return Arrays.stream(matrix)
                .mapToInt(lines -> lines[column])
                .toArray();
    }
}

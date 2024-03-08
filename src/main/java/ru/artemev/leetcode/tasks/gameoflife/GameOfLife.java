package ru.artemev.leetcode.tasks.gameoflife;

public class GameOfLife {


    /*
    1 - Любая живая клетка, имеющая менее двух живых соседей, умирает, как будто из-за недостаточной численности населения.
    2 - Любая живая клетка с двумя или тремя живыми соседями доживает до следующего поколения.
    3 - Любая живая клетка, имеющая более трех живых соседей, погибает, как бы от перенаселения.
    4 - Любая мертвая клетка, имеющая ровно три живых соседа, становится живой клеткой, как бы путем размножения.
     */

    public static void gameOfLife(int[][] board) {
        int[][] oldBoard = new int[board.length][];
        for (int i = 0; i < board.length; i++) {
            oldBoard[i] = board[i].clone();
        }
        for (int y = 0; y < oldBoard.length; y++) {
            for (int x = 0; x < oldBoard[y].length; x++) {
                int statusLife = oldBoard[y][x];
                int countLiveNeighbours = getCountLiveNeighbours(x, y, oldBoard);
                if (statusLife == 1 && (countLiveNeighbours < 2 || countLiveNeighbours > 3)) {
                    board[y][x] = 0;
                }
                if (statusLife == 1 && (countLiveNeighbours == 2 || countLiveNeighbours == 3)) {
                    board[y][x] = 1;
                }
                if (statusLife == 0 && countLiveNeighbours == 3) {
                    board[y][x] = 1;
                }
            }
        }
    }

    public static int getCountLiveNeighbours(int ix, int iy, int[][] board) {
        int result = 0;
        //left
        if (ix != 0) {
            result += board[iy][ix - 1];
        }
        //right
        if (ix != board[iy].length - 1) {
            result += board[iy][ix + 1];
        }
        //top
        if (iy != 0) {
            result += board[iy - 1][ix];
            //top + left
            if (ix != 0) {
                result += board[iy - 1][ix - 1];
            }
            //top + right
            if (ix != board[iy].length - 1) {
                result += board[iy - 1][ix + 1];
            }
        }
        //bottom
        if (iy != board.length - 1) {
            result += board[iy + 1][ix];
            //bottom + left
            if (ix != 0) {
                result += board[iy + 1][ix - 1];
            }
            //bottom + right
            if (ix != board[iy].length - 1) {
                result += board[iy + 1][ix + 1];
            }
        }
        return result;
    }
}

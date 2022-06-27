package org.example;
/*Place N chess queens on an N×N chessboard so that no two queens attack each other
The expected output is a binary matrix which has 1s for the blocks where queens are placed.
For example, the following is the output matrix for above 4 queen solution.
              { 0,  1,  0,  0}
              { 0,  0,  0,  1}
              { 1,  0,  0,  0}
              { 0,  0,  1,  0} */
public class NQueens_27_06_2022 {
    final int N=4;
    // method to print the solution.
    void printSolution(int[][] board){
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                System.out.print(" "+board[i][j]+" ");
            }
            System.out.println();
        }
    }
    //method to check if a queen can be placed in the block or not.
    boolean isSafe(int[][] board,int row, int col){
        int i,j;
        for (i = 0; i < col; i++)
            if (board[row][i] == 1)
                return false;

        /* Check upper diagonal on left side */
        for (i = row, j = col; i >= 0 && j >= 0; i--, j--)
            if (board[i][j] == 1)
                return false;

        /* Check lower diagonal on left side */
        for (i = row, j = col; j >= 0 && i < N; i++, j--)
            if (board[i][j] == 1)
                return false;
        return true;
    }
    // recursive method to get the possible solution.
    boolean solveNqueen(int[][] board, int col){
        if (col >= N) {
            return true;
        }
        for(int i=0;i<N;i++){
            if(isSafe(board,i,col)){
                board[i][col] = 1;

                if(solveNqueen(board, col + 1)){
                    return true;
                }
                board[i][col] = 0;
            }
        }
        return false;
    }
    void solveNQ()
    {
        int board[][] = { { 0, 0, 0, 0 },
                          { 0, 0, 0, 0 },
                          { 0, 0, 0, 0 },
                          { 0, 0, 0, 0 }};

        if (!solveNqueen(board, 0)) {
            System.out.print("Solution does not exist");
        }

        printSolution(board);
    }

    public static void main(String[] args) {
        NQueens_27_06_2022 NQ = new NQueens_27_06_2022();
        NQ.solveNQ();
    }
}

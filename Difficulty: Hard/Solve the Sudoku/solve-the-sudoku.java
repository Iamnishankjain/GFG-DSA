// User function Template for Java

class Solution {
    // Function to find a solved Sudoku.
    static void solveSudoku(int[][] mat) {
        solve(mat,0,0);
    }

    public static boolean solve(int[][] board,int r,int c){
        if(r==9) return true;
        
        if(board[r][c]!=0){
            int newI=(c==8) ? r+1 : r;
            int newJ=(c+1)%9;
            return solve(board,newI,newJ);
        }
        
        for(int ch=1;ch<=9;ch++){
            if(isValid(r,c,ch,board)){
                board[r][c]=ch;
                int newI=(c==8) ? r+1 : r;
                int newJ=(c+1)%9;
                if(solve(board,newI,newJ)) return true;
                board[r][c]=0;
            }
        }
        return false;
    }

    public static boolean isValid(int row,int col,int ch,int[][] board){
        for(int i=0;i<9;i++){
            if(board[i][col]==ch) return false;
            if(board[row][i]==ch) return false;

            if(board[3*(row/3)+i/3][3*(col/3)+i%3]==ch) return false;
        }
        return true;
    }
}
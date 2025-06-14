// User function Template for Java

class Solution {
    public ArrayList<ArrayList<Integer>> nQueen(int n) {
        ArrayList<ArrayList<Integer>> allBoards = new ArrayList<>();
        int[][] board = new int[n][n];
        helper(0,n,board,allBoards);
        return allBoards;
    }

    public static void helper(int col,int n,int[][] board,ArrayList<ArrayList<Integer>> allBoards){
        if(col==n){
            add(board,n,allBoards);
            return;
        }
        for(int i=0;i<n;i++){
            if(isSafe(i,col,n,board)){
                board[i][col]=1;
                helper(col+1,n,board,allBoards);
                board[i][col]=0;
            }
        }
    }
    public static boolean isSafe(int row,int col,int n,int[][] board){
        for(int j=0;j<col;j++){
            if(board[row][j]==1) return false;
        }
        for(int i=row,j=col;i>=0 && j>=0;i--,j--){
            if(board[i][j]==1) return false;
        }
        for(int i=row,j=col;i<n && j>=0;i++,j--){
            if(board[i][j]==1) return false;
        }
        return true;
    }

    public static void add(int[][] board,int n,ArrayList<ArrayList<Integer>> allBoards){
        List<Integer> list=new ArrayList<>();

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(board[i][j]==1){
                    list.add(j+1);
                }
            }
        }
        allBoards.add(new ArrayList<>(list));
    }
}
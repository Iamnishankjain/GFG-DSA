class Solution {
    // Function to find all possible paths
    public ArrayList<String> ratInMaze(int[][] maze) {
        ArrayList<String> list=new ArrayList<>();
        int n=maze.length;
        int m=maze[0].length;
        int visited[][]=new int[n][m];
        path(0,0,n,m,"",maze,visited,list);
        return list;
    }
    public void path(int i,int j,int n,int m,String s,int[][] maze,int visited[][],ArrayList<String> list){
        
        if(i<0 || j<0 || i>=n || j>=m || visited[i][j]==1 || maze[i][j]!=1){
            return;
        }
        if(i==n-1 && j==m-1){
             list.add(s);
             return;
        }
        visited[i][j]=1;
        path(i+1,j,n,m,s+"D",maze,visited,list);
        path(i,j-1,n,m,s+"L",maze,visited,list);
        path(i,j+1,n,m,s+"R",maze,visited,list);
        path(i-1,j,n,m,s+"U",maze,visited,list);
        visited[i][j]=0;
    }
}
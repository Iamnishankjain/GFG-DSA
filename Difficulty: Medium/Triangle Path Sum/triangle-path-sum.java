// User function Template for Java

class Solution {
    public int minPathSum(ArrayList<ArrayList<Integer>> triangle) {
        // Code here
        int n=triangle.size();
        int dp[][]=new int[n][n];
        for(int j=0;j<n;j++){
            dp[n-1][j]=triangle.get(n-1).get(j);
        }
        for(int i=n-1;i>=0;i--){
            for(int j=triangle.get(i).size()-1;j>=0;j--){
                if(i==n-1) dp[i][j]=triangle.get(i).get(j);
                else{
                    int d=triangle.get(i).get(j)+dp[i+1][j];
                    int dg=Integer.MAX_VALUE;
                    if(j<triangle.get(i).size())
                        dg=triangle.get(i).get(j)+dp[i+1][j+1];
                    dp[i][j]=Math.min(d,dg);
                }
            }
        }
        return dp[0][0];
    }
}
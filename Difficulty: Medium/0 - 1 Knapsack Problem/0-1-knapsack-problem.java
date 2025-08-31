class Solution {
    static int knapsack(int W, int val[], int wt[]) {
        // code here
        int n=val.length;
        int dp[][]=new int[n][W+1];
        
        for(int j=wt[0];j<=W;j++){
            dp[0][j]=val[0];
        }
        
        for(int i=1;i<n;i++){
            for(int j=0;j<=W;j++){
                int notPick=dp[i-1][j];
                int pick=0;
                if(wt[i]<=j){
                    pick+=val[i]+dp[i-1][j-wt[i]];
                }
                dp[i][j]=Math.max(pick,notPick);
            }
        }
        return dp[n-1][W];
    }
    
}

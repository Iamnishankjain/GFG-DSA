// User function Template for Java

class Solution {
    static int knapSack(int profit[], int weight[], int w) {
        // code here
        int n=weight.length;
        int dp[][]=new int[n][w+1];
        for(int j=weight[0];j<=w;j++){
            dp[0][j]=j/weight[0]*profit[0];
        }
        for(int i=1;i<n;i++){
            for(int j=0;j<=w;j++){
                int notpick=dp[i-1][j];
                int pick=0;
                if(weight[i]<=j){
                    pick+=profit[i]+dp[i][j-weight[i]];
                }
                dp[i][j]=Math.max(pick,notpick);
            }
        }
        return dp[n-1][w];
    }
}
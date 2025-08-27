// User function Template for Java

class Solution {

    public int minDifference(int nums[]) {
        int sum=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            sum+=nums[i];
        }
        boolean dp[][]=new boolean[n][sum+1];
        for(int j=0;j<=sum;j++){
            dp[0][j]= (j==nums[0]);
        }

        for(int i=1;i<n;i++){
            for(int j=0;j<=sum;j++){
                boolean notTaken=dp[i-1][j];
                boolean taken=false;
                if(j>=nums[i]){
                    taken=dp[i-1][j-nums[i]];
                }
                dp[i][j]=taken || notTaken;
            }
        }

        int min=Integer.MAX_VALUE;
        for(int j=0;j<=sum;j++){
            if(dp[n-1][j]){
                int diff=Math.abs(2*j-sum);
                min=Math.min(diff,min);
            }
        }
        return min;
    }
}

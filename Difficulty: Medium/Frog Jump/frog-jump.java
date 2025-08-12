// User function Template for Java
class Solution {
    int minCost(int[] height) {
        // code here
        int n=height.length;
        int dp[]=new int[n];
        dp[0]=0;
        
        for(int i=1;i<n;i++){
            int fs=dp[i-1]+Math.abs(height[i]-height[i-1]);
            int ss=Integer.MAX_VALUE;
            if(i>1)
               ss=dp[i-2]+Math.abs(height[i]-height[i-2]);
            dp[i]=Math.min(ss,fs);
        }
        return dp[n-1];
    }
}
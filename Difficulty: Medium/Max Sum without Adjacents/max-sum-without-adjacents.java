// User function Template for Java

class Solution {
    int findMaxSum(int arr[]) {
        // code here
        int n=arr.length;
        int dp[]=new int[n];
        dp[0]=arr[0];
        
        for(int i=1;i<n;i++){
            int pick=arr[i];
            if(i-2>=0){
                pick+=dp[i-2];
            }
            int notpick=dp[i-1];
            dp[i]=Math.max(pick,notpick);
        }
        return dp[n-1];
    }
}
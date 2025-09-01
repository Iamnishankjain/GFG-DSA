// User function Template for Java

class Solution {
    static int findTargetSumWays(int N, int[] arr, int target) {
        // code here
        int sum=0;
        for(int i=0;i<N;i++){
            sum+=arr[i];
        }
        int tar=sum-target;
        if(tar<0 || tar%2!=0) return 0;
        int ans=getWays(arr,tar/2,N);
        return ans;
    }

    public static int getWays(int arr[],int target,int n){
        int dp[][]=new int[n][target+1];
        if(arr[0]==0) dp[0][0]=2;
        else{
            dp[0][0]=1;
            if(arr[0]<=target) dp[0][arr[0]]= 1;
        }

        for(int i=1;i<n;i++){
            for(int j=0;j<=target;j++){
                int notpick=dp[i-1][j];
                int pick=0;
                if(arr[i]<=j){
                    pick+=dp[i-1][j-arr[i]];
                }
                dp[i][j]=notpick+pick;
            }
        }
        return dp[n-1][target];
    }
};
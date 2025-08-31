
class Solution {
    int countPartitions(int[] arr, int d) {
        // code here
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        int target=sum-d;
        if(target<0 || target%2==1) return 0;
        return perfectSum(arr,(target/2));
        
    }
    public int perfectSum(int[] num, int tar) {
        // code here
        int dp[][]=new int[num.length][tar+1];
        for(int i=0;i<num.length;i++){
            dp[i][0]=1;
        }
        if(num[0]==0)
            dp[0][0]=2;
        else{
            dp[0][0]=1;
            if(num[0]<=tar) dp[0][num[0]]=1;
        }
        for(int i=1;i<num.length;i++){
            for(int j=0;j<=tar;j++){
                int notpick=dp[i-1][j];
                int pick=0;
                if(num[i]<=j)
                    pick+=dp[i-1][j-num[i]];
                dp[i][j]=pick+notpick;
            }
        }
        return dp[num.length-1][tar];
    }
}

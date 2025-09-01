class Solution {
    public int cutRod(int[] price) {
        // code here
        int n=price.length;
        int dp[][]=new int[n][n+1];
		for(int j=0;j<=n;j++){
			dp[0][j]=j*price[0];
		}

		for(int i=1;i<n;i++){
			for(int j=0;j<=n;j++){
				int notcut=dp[i-1][j];
				int cut=0;
				if(i+1<=j){
					cut+=price[i]+dp[i][j-i-1];
				}
				dp[i][j]=Math.max(cut,notcut);
			}
		}
		return dp[n-1][n];
    }
}
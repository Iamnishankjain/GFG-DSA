// User function Template for Java
class Solution {
    public int maximumPath(int[][] mat) {
        // code here
        int max=Integer.MIN_VALUE;
        int n=mat.length;
        int m=mat[0].length;
		for(int j=0;j<m;j++){
			max=Math.max(getMax(n-1,j,mat,n,m),max);
		}
		return max;
	}

    public int getMax(int i,int j,int[][] mat, int n,int m){
        
        int dp[][]=new int[n][m];
        
        for(int k=0;k<=i;k++){
            for(int l=0;l<m;l++){
                if(k==0) dp[k][l]=mat[k][l];
                else{
                    int val=mat[k][l];
                    int s=Integer.MIN_VALUE,ld=Integer.MIN_VALUE,rd=Integer.MIN_VALUE;
                    s=val+dp[k-1][l];
                    if(l>0) ld=val+dp[k-1][l-1];
                    if(l<m-1) rd=val+dp[k-1][l+1];
                    dp[k][l]=Math.max(s,Math.max(ld,rd));
                }
            }
        }
        return dp[i][j];
	}
}
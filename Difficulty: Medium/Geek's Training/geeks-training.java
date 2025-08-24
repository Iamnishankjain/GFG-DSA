// User function Template for Java

class Solution {
    public int maximumPoints(int points[][]) {
        // code here
        int n=points.length;
        int dp[][]=new int[n][4];
        for(int i=0;i<4;i++){
            for(int j=0;j<3;j++){
                if(i!=j)
                 dp[0][i]=Math.max(dp[0][i],points[0][j]);
            }
        }
        
        for(int day=1;day<n;day++){
            for(int last=0;last<4;last++){
                dp[day][last]=0;
                for(int task=0;task<3;task++){
                    if(task!=last){
                        int point=points[day][task]+dp[day-1][task];
                        dp[day][last]=Math.max(dp[day][last],point);
                    }
                }
            }
        }
        return dp[n-1][3];
    }
    
}
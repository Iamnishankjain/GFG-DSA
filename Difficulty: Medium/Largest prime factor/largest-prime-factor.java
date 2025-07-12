// User function Template for Java

class Solution {
    static int largestPrimeFactor(int n) {
        int ans=-1;
        for(int i=2;i<=n;i++){
            if(n%i==0){
                ans=i;
                while(n%i==0)
                    n/=i;
            }
            if(n==0)
                break;
        }
        return ans;
    }
}
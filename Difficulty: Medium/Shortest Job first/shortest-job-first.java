// User function Template for Java

class Solution {
    static int solve(int bt[]) {
        // code here
        int n=bt.length;
        
        int wt=0,t=0;
        Arrays.sort(bt);
        for(int i=0;i<n;i++){
            wt+=t;
            t+=bt[i];
        }
        return wt/n;
    }
}

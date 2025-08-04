// User function Template for Java

class Solution {
    public int nthFibonacci(int n) {
        // code here
        int memo[]=new int[n+1];
        Arrays.fill(memo,-1);
        return get(n,memo);
    }
    public int get(int n,int[] memo){
        if(n<=1) return n;
        if(memo[n]!=-1){
            return memo[n];
        }
        memo[n]=get(n-1,memo)+get(n-2,memo);
        return memo[n];
    }
}
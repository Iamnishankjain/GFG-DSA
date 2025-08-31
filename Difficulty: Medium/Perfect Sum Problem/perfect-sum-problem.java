class Solution {
    // Function to calculate the number of subsets with a given sum
    public int perfectSum(int[] num, int tar) {
        // code here
        int memo[][]=new int[num.length][tar+1];
        for(int i=0;i<num.length;i++){
            Arrays.fill(memo[i],-1);
        }
        return check(num,tar,num.length-1,memo);
    }
    
    public static int check(int arr[],int k,int n,int memo[][]){
        if(n==0){
            if (k == 0 && arr[0] == 0) return 2;
            if(k==0) return 1;
            return k==arr[0] ? 1:0;
        }
        if(memo[n][k]!=-1) return memo[n][k];
        
        int notpick=check(arr,k,n-1,memo);
        int pick=0;
        if(arr[n]<=k)
            pick+=check(arr,k-arr[n],n-1,memo);
        return memo[n][k]= pick+notpick;
    }
}
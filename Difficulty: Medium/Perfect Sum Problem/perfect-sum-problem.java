class Solution {
    // Function to calculate the number of subsets with a given sum
    public int perfectSum(int[] num, int tar) {
        // code here
        int memo[][]=new int[num.length][tar+1];
        for(int i=0;i<num.length;i++){
            Arrays.fill(memo[i],-1);
        }
        return check(0,num,tar,num.length,memo);
    }
    
    public static int check(int ind,int arr[],int k,int n,int memo[][]){
        if(ind==n){
            return k==0 ? 1:0;
        }
        if(k<0) return 0;
        if(memo[ind][k]!=-1) return memo[ind][k];
        
        int count=0;
        count+=check(ind+1,arr,k-arr[ind],n,memo);
        count+=check(ind+1,arr,k,n,memo);
        return memo[ind][k]= count;
    }
}
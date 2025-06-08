// User function Template for Java

class Solution {
    public static boolean checkSubsequenceSum(int N, int[] arr, int K) {
        return check(0,0,arr,K,N);
    }
    
    public static boolean check(int ind,int sum,int[] arr,int k,int n){
        if(sum==k){
            return true;
        }
        if(ind>=n || sum>k){
            return false;
        }
        return check(ind+1,sum+arr[ind],arr,k,n) || check(ind+1,sum,arr,k,n);
    }
}

// User function Template for Java

class Solution {
    public int maximumSumSubarray(int[] arr, int k) {
        // Code here
        int n=arr.length;
        int l=0,r=k-1;
        
        int sum=0;
        for(int i=0;i<=r;i++){
            sum+=arr[i];
        }
        int maxSum=sum;
        while(r<n-1){
            sum-=arr[l];
            l++;
            r++;
            sum+=arr[r];
            maxSum=Math.max(maxSum,sum);
        }
        return maxSum;
    }
}
// User function Template for Java

class Solution {
    // Function to check if we can reach the last index from the 0th index.
    public boolean canReach(int[] arr) {
        // code here
        int maxInd=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(i>maxInd) return false;
            maxInd=Math.max(maxInd,i+arr[i]);
        }
        return true;
    }
}
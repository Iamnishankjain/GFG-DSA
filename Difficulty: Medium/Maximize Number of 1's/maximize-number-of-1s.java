// User function Template for Java

class Solution {
    // k is the maximum number of zeros allowed to flip
    public int maxOnes(int nums[], int k) {
        int l=0,zero=0,maxlen=0;

        for(int r=0;r<nums.length;r++){
            if(nums[r]==0) zero++;

            if(zero>k){
                if(nums[l]==0) zero--;
                l++;
            }
            if(zero<=k){
                maxlen=Math.max(maxlen,r-l+1);
            }
        }
        return maxlen;
    }
}
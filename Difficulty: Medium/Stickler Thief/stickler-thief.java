class Solution {
    public int findMaxSum(int nums[]) {
        // code here
        int prev2=0;
        int prev=nums[0];
        for(int i=1;i<nums.length;i++){
            int pick=nums[i];
            if(i-2>=0){
                pick+=prev2;
            }
            int curr=Math.max(prev,pick);
            prev2=prev;
            prev=curr;
        }
        return prev;
    }
}
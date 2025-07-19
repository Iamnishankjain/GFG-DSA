class Solution {
    static int minJumps(int[] nums) {
        // code here
        int l=0,r=0,jump=0;
        int n=nums.length;
        while(r<n-1){
            int far=r;
            for(int i=l;i<=r;i++){
                far=Math.max(far,i+nums[i]);
            }
            if (far == r) return -1; 
            l=r+1;
            r=far;
            jump++;
        }
        return jump;
    }
}
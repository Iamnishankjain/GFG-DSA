class Solution {
    ArrayList<Integer> twoOddNum(int[] nums) {
        // code here
        int xor=0;
        for(int i=0;i<nums.length;i++){
            xor^=nums[i];
        }

        int check=(xor&(xor-1))^xor;
        int b1=0,b2=0;

        for(int i=0;i<nums.length;i++){
            if((nums[i]&check)!=0){
                b1^=nums[i];
            }
            else{
                b2^=nums[i];
            }
        }
        return b1>b2 ? new ArrayList<>(List.of(b1,b2)) : new ArrayList<>(List.of(b2,b1));
    }
}

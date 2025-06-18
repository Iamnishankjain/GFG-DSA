

// User function Template for Java

class Solution {
    public List<Integer> valueEqualToIndex(List<Integer> nums) {
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<nums.size();i++){
            if(nums.get(i)==i+1){
                list.add(i+1);
            }
        }
        return list;
    }
}
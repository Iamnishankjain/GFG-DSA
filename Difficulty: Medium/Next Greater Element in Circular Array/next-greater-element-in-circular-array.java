class Solution {
    public ArrayList<Integer> nextLargerElement(int[] nums) {
        Stack<Integer> stack=new Stack<>();
        int n=nums.length;
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=2*n-1;i>=0;i--){
           if(i>=n){
                while(!stack.isEmpty() && stack.peek()<=nums[i%n]){
                    stack.pop();
                }
                stack.push(nums[i%n]);
           }
           else{
                while(!stack.isEmpty() && stack.peek()<=nums[i]){
                    stack.pop();
                }
                if(stack.isEmpty()){
                    arr.add(0,-1);
                }
                else{
                    arr.add(0,stack.peek());
                }
                stack.push(nums[i]);
           }
        }
        return arr;
    }
}
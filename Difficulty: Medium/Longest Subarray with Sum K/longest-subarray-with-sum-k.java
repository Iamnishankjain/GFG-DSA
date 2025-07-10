

// User function Template for Java

class Solution {
    public int longestSubarray(int[] arr, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        
        int sum=0;
        int len=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum==k){
                len=Math.max(len,i+1);
            }
            
            int rem=sum-k;
            if(map.containsKey(rem)){
                int currlen=i-map.get(rem);
                len=Math.max(len,currlen);
            }
            
            if(!map.containsKey(sum)){
                map.put(sum,i);
            }
        }
        return len;
    }
}

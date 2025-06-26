


class Solution {
    int maxLen(int arr[]) {
        Map<Integer,Integer> map=new HashMap<>();
        int len=0;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum==0){
                len=Math.max(len,i+1);
            }
            if(map.containsKey(sum)){
                int currlen=i-map.get(sum);
                len=Math.max(len,currlen);
            }
            else{
                map.put(sum,i);
            }
        }
        return len;
    }
}
class Solution {
    public int totalElements(int[] arr) {
        // code here
        HashMap<Integer,Integer> map=new HashMap<>();

        int l=0,maxlen=0,k=2;
        for(int r=0;r<arr.length;r++){
            map.put(arr[r],map.getOrDefault(arr[r],0)+1);

            if(map.size()>k){
                map.put(arr[l],map.get(arr[l])-1);
                if(map.get(arr[l])==0) map.remove(arr[l]);
                l++;
            }
            if(map.size()<=k)
                maxlen=Math.max(maxlen,r-l+1);
        }
        return maxlen;
    }
}
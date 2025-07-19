
class Solution {
    public int maxChildren(int[] greed, int[] cookie) {
        Arrays.sort(greed);
        Arrays.sort(cookie);
        
        int i=0,j=0;
        while(i<greed.length && j<cookie.length){
            if(greed[i]<=cookie[j]){
                i++;
            }
            j++;
        }
        return i;
    }
}
class Solution {
    public int longestKSubstr(String s, int k) {
        // code here
        int maxlen=-1,l=0;
		int n=s.length();
		HashMap<Character,Integer> map=new HashMap<>();
		for(int r=0;r<n;r++){
			char ch=s.charAt(r);
			map.put(ch,map.getOrDefault(ch,0)+1);

			if(map.size()>k){
				char f=s.charAt(l);
				map.put(f,map.get(f)-1);
				if(map.get(f)==0) map.remove(f);
				l++;
			}
			if(map.size()==k){
				maxlen=Math.max(maxlen,r-l+1);
			}
		}
		return maxlen;
    }
}
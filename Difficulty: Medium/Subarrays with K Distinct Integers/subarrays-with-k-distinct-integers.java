// User function Template for Java

class Solution {
    static int exactlyK(int arr[], int k) {
        // code here
        return cntLessK(arr,k)-cntLessK(arr,k-1);
    }

    public static int cntLessK(int nums[],int k){
        int cnt=0,l=0;
		int n=nums.length;
		HashMap<Integer,Integer> map=new HashMap<>();
		for(int r=0;r<n;r++){
			map.put(nums[r],map.getOrDefault(nums[r],0)+1);

			while(map.size()>k){
				map.put(nums[l],map.get(nums[l])-1);
				if(map.get(nums[l])==0) map.remove(nums[l]);
				l++;
			}
			if(map.size()<=k){
				cnt+=r-l+1;
			}
		}
		return cnt;
    }
}

// User function template for JAVA

class Solution {
    // Function to find all combinations of elements
    // in array arr that sum to target.
    static ArrayList<ArrayList<Integer>> uniqueCombinations(int[] arr, int target) {
        Arrays.sort(arr);
        ArrayList<ArrayList<Integer>> res=new ArrayList<>();
        ArrayList<Integer> ans=new ArrayList<>();
        getSubset(0,target,ans,arr,arr.length,res);
        return res;
    }

    static void getSubset(int ind,int target,ArrayList<Integer> ans,int[] arr,int n,ArrayList<ArrayList<Integer>> res){
        if(target==0){
            res.add(new ArrayList<>(ans));
            return;
        }
        if(ind==n || target<0){
            return;
        }
        for(int i=ind;i<n;i++){
            if(i>ind && arr[i]==arr[i-1]) continue;
            if(arr[i]>target) break;
            ans.add(arr[i]);
            getSubset(i+1,target-arr[i],ans,arr,n,res);
            ans.remove(ans.size()-1);
        }
    }
}
// User function template for JAVA

class Solution {
    // Function to find all combinations of elements
    // in array arr that sum to target.
    static ArrayList<ArrayList<Integer>> combinationSum(int[] arr, int target) {
        ArrayList<ArrayList<Integer>> res=new ArrayList<>();
        combine(0,0,new ArrayList<>(),target,arr,arr.length,res);
        return res;
    }

    public static void combine(int ind,int sum,ArrayList<Integer> list,int target,int[] arr,int n,ArrayList<ArrayList<Integer>> res){
        if (sum > target || n==ind) return;
        if(sum==target){
            res.add(new ArrayList<>(list));
            return;
        }

        list.add(arr[ind]);
        combine(ind,sum+arr[ind],list,target,arr,n,res);
        list.remove(list.size()-1);
        combine(ind+1,sum,list,target,arr,n,res);
    }
}
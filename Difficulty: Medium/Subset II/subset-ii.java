// User function Template for Java

class Solution {
    public static ArrayList<ArrayList<Integer>> printUniqueSubsets(int[] arr) {
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
        Arrays.sort(arr);
        subset(0,arr,new ArrayList<>(),list,arr.length);
        return list;
    }

    public static void subset(int ind,int[] arr,ArrayList<Integer> ans,ArrayList<ArrayList<Integer>> list,int n){
        list.add(new ArrayList(ans));
        for(int i=ind;i<n;i++){
            if(i==ind || arr[i]!=arr[i-1]){
                ans.add(arr[i]);
                subset(i+1,arr,ans,list,n);
                ans.remove(ans.size()-1);
            }
        }
    }
}
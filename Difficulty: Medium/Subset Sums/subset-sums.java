// User function Template for Java//User function Template for Java
class Solution {
    public ArrayList<Integer> subsetSums(int[] arr) {
        
        ArrayList<Integer> list=new ArrayList<>();
        subSum(0,arr,list,arr.length,0);
        return list;
    }
    
    public void subSum(int ind,int[] arr,ArrayList<Integer> list,int n,int sum){
        if(ind==n){
            list.add(sum);
            return;
        }
        sum+=arr[ind];
        subSum(ind+1,arr,list,n,sum);
        sum-=arr[ind];
        subSum(ind+1,arr,list,n,sum);
    }
}
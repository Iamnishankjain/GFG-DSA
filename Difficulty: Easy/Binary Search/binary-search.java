

// User function Template for Java

class Solution {
    public int binarysearch(int[] arr, int k) {
        int ub=arr.length-1;
        int lb=0;
        int ans=-1;
        do{
            int mid = lb + (ub - lb) / 2;
            
            if(arr[mid]==k){
                ans=mid;
                ub=mid-1;
            }
            else if(arr[mid]<k){
                lb=mid+1;
            }
            else{
                ub=mid-1;
            }
        }while(lb<=ub);
        return ans;
    }
}
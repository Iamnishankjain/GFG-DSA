

class Solution {
    // Function to find equilibrium point in the array.
    public static int findEquilibrium(int arr[]) {
        int n=arr.length;
        if(n==1){
            return 0;
        }
        if(n==2){
            return -1;
        }
        int rs=0;
        int ls=0;
        for(int i=1;i<n;i++){
            rs+=arr[i];
        }
        for(int i=0;i<n-1;i++){
            if(ls==rs){
                return i;
            }
                ls+=arr[i];
                rs-=arr[i+1];
        }
        return -1;
    }
}

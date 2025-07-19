// User function Template for Java

class Solution {
    // Function to find the minimum number of platforms required at the
    // railway station such that no train waits.
    static int findPlatform(int arr[], int dep[]) {
        Arrays.sort(arr);
        Arrays.sort(dep);
        
        int n=arr.length;
        int i=0,j=0;
        int plat=0;
        int cnt=0;
        while(i<n && j<n){
            if(arr[i]<=dep[j]){
                i++;
                cnt++;
                plat=Math.max(plat,cnt);
            }else{
                j++;
                cnt--;
            }
        }
        return plat;
    }
}

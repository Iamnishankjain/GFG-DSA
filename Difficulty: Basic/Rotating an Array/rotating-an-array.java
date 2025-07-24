

// User function Template for Java

class Solution {
    void leftRotate(int arr[], int d) {
        int n=arr.length;
        reverse(arr,0,d-1);
        reverse(arr,d,n-1);
        reverse(arr,0,n-1);
    }
    
    void reverse(int arr[], int lb,int ub){
        while(lb<ub){
            int temp=arr[lb];
            arr[lb]=arr[ub];
            arr[ub]=temp;
            lb++;
            ub--;
        }
    }
}

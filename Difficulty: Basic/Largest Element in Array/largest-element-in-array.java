


class Solution {
    public static int largest(int[] arr) {
        int n=arr.length;
        int max=0;
        for(int i=0;i<n;i++){
            max=Math.max(max,arr[i]);
        }
        return max;
    }
}

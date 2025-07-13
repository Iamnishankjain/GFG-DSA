// User function Template for Java

class Solution {
    public static int[] count_NGEs(int N, int arr[], int queries, int indices[]) {
        for(int i=0;i<indices.length;i++){
            int cnt=0;
            for(int j=indices[i]+1;j<N;j++){
                if(arr[j]>arr[indices[i]]){
                    cnt++;
                }
            }
            indices[i]=cnt;
        }
        return indices;
    }
}

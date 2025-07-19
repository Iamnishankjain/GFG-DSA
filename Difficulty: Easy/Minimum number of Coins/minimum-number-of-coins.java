// User function Template for Java

class Solution {
    static List<Integer> minPartition(int N) {
        // code here
        ArrayList<Integer> list=new ArrayList<>();
        int arr[]={2000,500,200,100,50,20,10,5,2,1};
        for(int i=0;i<arr.length;i++){
            while(arr[i]<=N){
                list.add(arr[i]);
                N-=arr[i];
            }
            if(N==0) break;
        }
        return list;
    }
}
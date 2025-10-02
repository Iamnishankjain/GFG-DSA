






class Solution {
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        ArrayList<Integer> list=new ArrayList<>();
        int sum=0;
        int j=0;
        for(int i=j;i<arr.length;i++){
            sum+=arr[i];
            while(sum>target && j<i){
                sum-=arr[j++];
            }
            if(sum==target){
                list.add(j+1);
                list.add(i+1);
                break;
            }
        }
        if(list.isEmpty())
            list.add(-1);
        return list;
    }
}



class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        ArrayList<Integer> list=new ArrayList<>();
        int max=Integer.MIN_VALUE;
        for(int i=arr.length-1;i>=0;i--)
        {
            if(max<=arr[i]){
                list.add(0,arr[i]);
                max=arr[i];
            }
        }
        return list;
    }
}

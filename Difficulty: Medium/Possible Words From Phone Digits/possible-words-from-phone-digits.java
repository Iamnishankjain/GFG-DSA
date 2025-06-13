class Solution {
    public ArrayList<String> possibleWords(int[] arr) {
        // code here
        ArrayList<String> list=new ArrayList<>();
        if(arr.length==0) return list;
        String map[]={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        solve(0,arr,new StringBuilder(""),arr.length,map,list);
        return list;
    }

    public static void solve(int ind,int arr[],StringBuilder ans,int n,String map[],ArrayList<String> list){
        if(ind>=n){
            list.add(ans.toString());
            return;
        }

        String str=map[arr[ind]];
        for(int i=0;i<str.length();i++){
            ans.append(str.charAt(i));
            solve(ind+1,arr,ans,n,map,list);
            ans.deleteCharAt(ans.toString().length()-1);
        }
    }
}
// User function Template for Java

class Solution {
    public static List<String> generateBinaryStrings(int n) {
        List<String> list=new ArrayList<>();
        valid(list,n,n,"",n,-1);
        return list;
    }

    public static void valid(List<String> list,int one,int zero,String s,int n,int flag){
        if(s.length()>n){
            return;
        }
        if(s.length()==n){
            list.add(s);
            s="";
            return;
        }
        valid(list,one,zero-1,s+'0',n,0);
        if(flag!=1)
        valid(list,one-1,zero,s+'1',n,1);
    }
}

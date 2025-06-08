// User function Template for Java

class Solution {
    public List<String> AllPossibleStrings(String s) {
        // Code here
        List<String> list=new ArrayList<>();
        sub(0,list,s,new StringBuilder());
        Collections.sort(list);
        return list;
    }
    
    public void sub(int ind,List<String> list,String s,StringBuilder sb){
        if(ind==s.length()){
            return;
        }
        sb.append(s.charAt(ind));
        list.add(sb.toString());
        sub(ind+1,list,s,sb);
        sb.deleteCharAt(sb.length()-1);
        sub(ind+1,list,s,sb);
    }
}
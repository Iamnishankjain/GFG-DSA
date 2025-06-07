// User function Template for Java

class Solution {
    static void reverse(Stack<Integer> s) {
        if(s.isEmpty()){
            return;
        }
        int top=s.pop();
        reverse(s);
        insertBottom(s,top);
    }
    
    static void insertBottom(Stack<Integer> s,int ele){
        if(s.isEmpty()){
            s.push(ele);
            return;
        }
        int top=s.pop();
        insertBottom(s,ele);
        s.push(top);
    }
}
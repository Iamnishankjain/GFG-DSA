// User function Template for Java

class Solution {
    static String preToPost(String s) {
        // code here
        Stack<String> stack =new Stack<>();
        for(int i=s.length()-1;i>=0;i--){
            char ch=s.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                stack.push(""+ch);
            }else{
                String t1=stack.pop();
                String t2=stack.pop();
                stack.push(t1+t2+ch);
            }
        }
        return stack.pop();
    }
}

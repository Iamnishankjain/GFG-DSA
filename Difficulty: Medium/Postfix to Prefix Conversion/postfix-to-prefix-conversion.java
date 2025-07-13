// User function Template for Java

class Solution {
    static String postToPre(String s) {
        Stack<String> stack =new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                stack.push(""+ch);
            }else{
                String t1=stack.pop();
                String t2=stack.pop();
                stack.push(ch+t2+t1);
            }
        }
        return stack.pop();
    }
}

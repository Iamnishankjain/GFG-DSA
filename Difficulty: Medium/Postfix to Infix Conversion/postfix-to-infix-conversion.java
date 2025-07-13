// User function Template for Java

class Solution {
    static String postToInfix(String postfix) {
        Stack<String> stack=new Stack<>();
        int i=0;
        while(i<postfix.length()){
            char ch=postfix.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                String s=""+ch;
                stack.push(s);
            }
            else{
                String b = stack.pop();
                String a = stack.pop();
                String expr = "(" + a + ch + b + ")";
                stack.push(expr);
            }
            i++;
        }
        return stack.pop();
    }
}

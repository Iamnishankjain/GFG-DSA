// User function Template for Java

class Solution {
    static String preToInfix(String s) {
        // code here
        Stack<String> stack=new Stack<>();
        int i=s.length()-1;
        while(i>=0){
            char ch=s.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                stack.push(""+ch);
            }
            else{
                String a = stack.pop();
                String b = stack.pop();
                String expr = "(" + a + ch + b + ")";
                stack.push(expr);
            }
            i--;
        }
        return stack.pop();
    }
}

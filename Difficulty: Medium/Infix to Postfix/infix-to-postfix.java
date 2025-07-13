class Solution {
    public static String infixToPostfix(String s) {
        int i=0;
        Stack<Character> stack=new Stack<>();
        StringBuilder sb=new StringBuilder();

        while(i<s.length()){
            char ch=s.charAt(i);
            if((ch>='A' && ch<='Z') || (ch>='0' && ch<='9') 
            || (ch>='a' && ch<='z')){
                sb.append(ch);
            }
            else if(ch=='('){
                stack.push(ch);
            }
            else if(ch==')'){
                while(!stack.isEmpty() && stack.peek()!='('){
                    sb.append(stack.pop());
                }
                stack.pop();
            }
            else{
                while(!stack.isEmpty() && stack.peek()!='(' && priority(ch)<=priority(stack.peek())){
                    sb.append(stack.pop());
                }
                stack.push(ch);
            }
            i++;
        }
            while (!stack.isEmpty()) {
                sb.append(stack.pop());
            }
        return sb.toString();
    }
    public static int priority(char a){
        if(a=='+' || a=='-') return 1;
        if(a=='/' || a=='*') return 2;
        if(a=='^') return 3;
        return -1;
    }
    public static boolean isLeftAssociative(char op) {
        return op != '^';
    }
}
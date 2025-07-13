// User function Template for Java

class Solution {
    static String postToPre(String post_exp) {
        String infix=postToInfix(post_exp);
        return infixToPrefix(infix);
        
    }
    static String postToInfix(String postfix) {
        Stack<String> stack = new Stack<>();
        int i = 0;
        while (i < postfix.length()) {
            char ch = postfix.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
                stack.push("" + ch);
            } else {
                String b = stack.pop();
                String a = stack.pop();
                String expr = "(" + a + ch + b + ")";
                stack.push(expr);
            }
            i++;
        }
        return stack.pop();
    }
    
    static String infixToPrefix(String s) {
        int i = s.length() - 1;
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
    
        while (i >= 0) {
            char ch = s.charAt(i);
    
            if ((ch >= 'A' && ch <= 'Z') || 
                (ch >= 'a' && ch <= 'z') || 
                (ch >= '0' && ch <= '9')) {
                sb.insert(0, ch);
            } else if (ch == ')') {
                stack.push(ch);
            } else if (ch == '(') {
                while (!stack.isEmpty() && stack.peek() != ')') {
                    sb.insert(0, stack.pop());
                }
                if (!stack.isEmpty()) stack.pop(); // pop ')'
            } else {
                while (!stack.isEmpty() && stack.peek() != ')' && 
                       priority(ch) < priority(stack.peek())) {
                    sb.insert(0, stack.pop());
                }
                stack.push(ch);
            }
    
            i--;
        }
    
        while (!stack.isEmpty()) {
            sb.insert(0, stack.pop());
        }
    
        return sb.toString();
    }
    
    static int priority(char a) {
        if (a == '+' || a == '-') return 1;
        if (a == '*' || a == '/') return 2;
        if (a == '^') return 3;
        return -1;
    }

}

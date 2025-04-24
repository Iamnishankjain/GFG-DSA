//{ Driver Code Starts
// Initial template for JAVA

import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t > 0) {
            String str = sc.nextLine();

            Solution obj = new Solution();
            int num = obj.myAtoi(str);
            System.out.println(num);
            System.out.println("~");
            t--;
        }
    }
}
// } Driver Code Ends


class Solution {
    public int myAtoi(String s) {
        s=s.trim();
        int i=0, sign=1,num=0;
        
        if(s.charAt(i)=='-'){
            sign=-1;
            i++;
        }
        
        while(i<s.length() && Character.isDigit(s.charAt(i))){
            
            int digit=s.charAt(i)-'0';
            
            if(num>(Integer.MAX_VALUE-digit)/10){
                return sign==1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            
            num=num*10+digit;
            i++;
        }
        return num*sign;
    }
}
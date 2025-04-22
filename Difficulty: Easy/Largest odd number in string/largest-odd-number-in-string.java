//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Main {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            String s = br.readLine();
            Solution obj = new Solution();
            System.out.println(obj.maxOdd(s));
        
System.out.println("~");
}
    }
}
// } Driver Code Ends


class Solution {

    String maxOdd(String str) {
        int n=str.length();
        String ans="";
        for(int i=n-1;i>=0;i--){
            char ch=str.charAt(i);
            int digit=ch-'0';
            if(digit%2==1){
                ans=str.substring(0,i+1);
                break;
            }
        }
        return ans;
    }
}
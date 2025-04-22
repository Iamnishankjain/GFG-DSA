//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String arr[] = read.readLine().trim().split(" ");

            Solution ob = new Solution();
            String ans = ob.longestCommonPrefix(arr);

            if (ans.isEmpty()) {
                System.out.print("\"\"");
            } else {
                System.out.print(ans);
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


// User function Template for Java
class Solution {
    public String longestCommonPrefix(String strs[]) {
        StringBuilder sb=new StringBuilder("");
        Arrays.sort(strs);
        int n=strs.length;
        String first=strs[0];
        String last=strs[n-1];

        for(int i=0;i<first.length();i++){
            if(first.charAt(i)!=last.charAt(i)){
                break;
            }
            sb.append(first.charAt(i));
        }
        return sb.toString();
    }
}
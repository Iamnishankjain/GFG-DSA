//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            int m = Integer.parseInt(br.readLine().trim());
            Solution ob = new Solution();
            int ans = ob.nthRoot(n, m);
            System.out.println(ans);

            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public int nthRoot(int n, int m) {
        int lb=1;
        int ub=m/n+1;
        while(lb<=ub){
            int mid=lb+(ub-lb)/2;
            long nth= (long)Math.pow(mid,n);
            if(nth==m){
                return mid;
            }
            else if(nth>m){
                ub=mid-1;
            }
            else{
                lb=mid+1;
            }
        }
        return -1;
    }
}
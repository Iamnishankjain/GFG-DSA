//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());

        while (tc-- > 0) {

            String[] str = br.readLine().trim().split(" ");
            int[] a = new int[str.length];
            for (int i = 0; i < str.length; i++) {
                a[i] = Integer.parseInt(str[i]);
            }
            String[] nk = br.readLine().trim().split(" ");
            int k = Integer.parseInt(nk[0]);
            Solution sln = new Solution();
            int ans = sln.countFreq(a, k);

            System.out.println(ans);
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


class Solution {
    int countFreq(int[] arr, int target) {
        int f=first(arr,arr.length,target);
        if(f==-1) return 0;
        return (last(arr,arr.length,target)-f+1);
    }
   int first(int []arr, int n, int x) {
        int ans=-1;
        int lb=0;
        int ub=n-1;
        while(lb<=ub){
            int mid=lb+((ub-lb)/2);
            if(arr[mid]==x){
                ans=mid;
                ub=mid-1;
            }
            else if(arr[mid]>x){
                ub=mid-1;
            }
            else{
                lb=mid+1;
            }
        }
        return ans;
    }
    int last(int []arr, int n, int x){
        int ans=-1;
        int lb=0;
        int ub=n-1;
        while(lb<=ub){
            int mid=lb+((ub-lb)/2);
            if(arr[mid]==x){
                ans=mid;
                lb=mid+1;
            }
            else if(arr[mid]>x){
                ub=mid-1;
            }
            else{
                lb=mid+1;
            }
        }
        return ans;
    }
}

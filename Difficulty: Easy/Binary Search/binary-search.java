//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

public class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); // consume the newline
        while (t-- > 0) {
            int k = sc.nextInt();
            sc.nextLine(); // consume the newline
            String input = sc.nextLine();
            String[] strNumbers = input.split(" ");
            int[] arr = new int[strNumbers.length];
            for (int i = 0; i < strNumbers.length; i++) {
                arr[i] = Integer.parseInt(strNumbers[i]);
            }
            Solution ob = new Solution();
            int res = ob.binarysearch(arr, k);
            System.out.println(res);

            System.out.println("~");
        }
        sc.close();
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public int binarysearch(int[] arr, int k) {
        int ub=arr.length-1;
        int lb=0;
        int ans=-1;
        do{
            int mid = lb + (ub - lb) / 2;
            
            if(arr[mid]==k){
                ans=mid;
                ub=mid-1;
            }
            else if(arr[mid]<k){
                lb=mid+1;
            }
            else{
                ub=mid-1;
            }
        }while(lb<=ub);
        return ans;
    }
}
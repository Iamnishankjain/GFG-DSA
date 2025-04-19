//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.math.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            int k = sc.nextInt();
            Solution obj = new Solution();
            double ans = obj.findSmallestMaxDist(a, k);
            System.out.printf("%.2f", ans);
            System.out.println();
        
System.out.println("~");
}
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public static double findSmallestMaxDist(int arr[], int k) {
        int n=arr.length;
        double low=0;
        double high=0;
        for(int i=0;i<n-1;i++){
            high=Math.max(arr[i+1]-arr[i],high);
        }
        while(high-low>1e-6){
            double mid=(low+high)/2;
            int count=numberOfGasStation(arr,mid);
            if(count>k){
                low=mid;
            }
            else{
                high=mid;
            }
        }
        return high;
    }
    public static int numberOfGasStation(int arr[], double dist){
        int count=0;
        for(int i=1;i<arr.length;i++){
            int noInBw=(int)((arr[i]-arr[i-1])/dist);
            if((arr[i]-arr[i-1])/dist==noInBw*dist){
                noInBw--;
            }
            count+=noInBw;
        }
        return count;
    }
}

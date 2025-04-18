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
    public static class Pair {
        double first;
        int second;

        Pair(double first, int second) {
            this.first = first;
            this.second = second;
        }
    }
    public static double findSmallestMaxDist(int arr[], int k) {
        int n=arr.length;
        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> Double.compare(b.first, a.first));
        int howMany[]=new int[n-1];

        for(int i=0;i<n-1;i++){
            pq.add(new Pair(arr[i+1]-arr[i],i));
        }
        for(int gasS=1;gasS<=k;gasS++){
                Pair top=pq.poll();
                int secInd=top.second;
                howMany[secInd]++;
                double diff=arr[secInd+1]-arr[secInd];
                double sectionlength=diff/(double)(howMany[secInd]+1);
                pq.add(new Pair(sectionlength,secInd)); 
        }
        return pq.poll().first;
    }
}

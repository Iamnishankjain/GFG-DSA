//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class Driver {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String arr1[] = br.readLine().split(" ");
            int[] a = new int[arr1.length];

            for (int i = 0; i < a.length; i++) a[i] = Integer.parseInt(arr1[i]);

            String arr2[] = br.readLine().split(" ");
            int[] b = new int[arr2.length];

            for (int i = 0; i < arr2.length; i++) b[i] = Integer.parseInt(arr2[i]);

            if (b.length == 1 && b[0] == 0) {
                b = new int[0];
            }
            double res = new Solution().medianOf2(a, b);

            if (res == (int)res)
                System.out.println((int)res);
            else
                System.out.println(res);
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public double medianOf2(int a[], int b[]) {
        int n1=a.length;
        int n2=b.length;
        int n=n1+n2;
        int i=0,j=0;
        int cnt=0;
        int ind2=n/2, ind1=ind2-1;
        int ele1=-1, ele2=-1;
        while(i<n1 && j<n2){
            if(a[i]<b[j]){
                if(cnt==ind1) ele1=a[i];
                if(cnt==ind2) ele2=a[i];
                cnt++;
                i++;
            }
            else{
                if(cnt==ind1) ele1=b[j];
                if(cnt==ind2) ele2=b[j];
                cnt++;
                j++;
            }
        }
        while(i<n1){
            if(cnt==ind1) ele1=a[i];
            if(cnt==ind2) ele2=a[i];
            cnt++;
            i++;
        }
        while(j<n2){
            if(cnt==ind1) ele1=b[j];
            if(cnt==ind2) ele2=b[j];
            cnt++;
            j++;
        }

        if(n%2!=1){
            return (ele2+ele1)/2.0;
        }
        return (double) ele2;
    }
}
//{ Driver Code Starts
// Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        int t = Integer.parseInt(in.readLine().trim());
        while (t-- > 0) {
            String line = in.readLine();
            String[] tokens = line.split(" ");

            // Create an ArrayList to store the integers
            ArrayList<Integer> array = new ArrayList<>();

            // Parse the tokens into integers and add to the array
            for (String token : tokens) {
                array.add(Integer.parseInt(token));
            }

            int[] arr = new int[array.size()];
            int idx = 0;
            for (int i : array) arr[idx++] = i;

            int key = Integer.parseInt(in.readLine().trim());
            Solution ob = new Solution();
            out.println(ob.kthSmallest(arr, key));
            out.println("~");
        }
        out.flush();
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public static int kthSmallest(int[] arr, int k) {
        int max=0;
        for(int num: arr){
            max=Math.max(max,num);
        }
        
        int temp[]=new int[max+1];
        for(int i=0;i<arr.length;i++){
            temp[arr[i]]++;
        }
        
        
        int i=0;
        while(i<arr.length){
            for(int j=0;j<max+1;j++){
                for(int r=0;r<temp[j];r++){
                    arr[i]=j;
                    i++;
                }
            }
        }
        return arr[k-1];
    }
}

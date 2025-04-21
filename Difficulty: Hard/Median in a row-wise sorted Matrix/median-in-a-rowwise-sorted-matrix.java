//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int R = Integer.parseInt(read.readLine());
            int C = Integer.parseInt(read.readLine());
            int matrix[][] = new int[R][C];
            int c = 0;
            for (int i = 0; i < R; i++) {
                String line[] = read.readLine().trim().split(" ");
                for (int j = 0; j < C; j++) {
                    matrix[i][j] = Integer.parseInt(line[j]);
                }
            }
            Solution ob = new Solution();
            int ans = ob.median(matrix);
            System.out.println(ans);

            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    int median(int mat[][]) {
        int n=mat.length;
        int m=mat[0].length;
        int req=(m*n)/2;
        
        int low=Integer.MAX_VALUE;
        int high=Integer.MIN_VALUE;
        
        for(int i=0;i<n;i++){
            low=Math.min(low,mat[i][0]);
            high=Math.max(high,mat[i][m-1]);
        }
        while(low<=high){
            int mid=low+(high-low)/2;
            
            int smallerEqual=blackBox(mat,n,m,mid);
            if(smallerEqual<=req){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return low;
    }
    
    int blackBox(int mat[][],int n,int m,int target){
        int cnt=0;
        for(int i=0;i<n;i++){
            cnt+=upperBound(mat[i],m,target);
        }
        return cnt;
    }
    
    int upperBound(int mat[],int m,int target){
        int low=0;
        int high=m-1;
        int ans=m;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(mat[mid]>target){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }

}
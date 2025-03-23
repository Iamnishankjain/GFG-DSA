//{ Driver Code Starts
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            int x = Integer.parseInt(br.readLine());
            String[] input = br.readLine().split(" ");
            int[] arr = new int[input.length];
            for (int i = 0; i < input.length; i++) {
                arr[i] = Integer.parseInt(input[i]);
            }

            Solution ob = new Solution();
            int[] ans = ob.getFloorAndCeil(x, arr);
            System.out.println(ans[0] + " " + ans[1]);
        
System.out.println("~");
}
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public int[] getFloorAndCeil(int x, int[] arr) {
        Arrays.sort(arr);
        int n=arr.length;
        int ans1=-1;
        int lb=0;
        int ub=n-1;
        while(lb<=ub){
            int mid=lb+(ub-lb)/2;
            if(arr[mid]>=x){
                ans1=arr[mid];
                ub=mid-1;
            }
            else{
                lb=mid+1;
            }
        }
        int ans2=-1;
        lb=0;
        ub=n-1;
        while(lb<=ub){
            int mid=lb+(ub-lb)/2;
            if(arr[mid]<=x){
                ans2=arr[mid];
                lb=mid+1;
            }
            else{
                ub=mid-1;
            }
        }
        return new int[]{ans2,ans1};
    }
}

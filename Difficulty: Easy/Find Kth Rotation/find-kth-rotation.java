//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            List<Integer> arr = new ArrayList<>();
            String input1 = sc.nextLine();
            Scanner ss1 = new Scanner(input1);
            while (ss1.hasNextInt()) {
                arr.add(ss1.nextInt());
            }
            Solution ob = new Solution();
            int res = ob.findKRotation(arr);
            System.out.println(res);
        
System.out.println("~");
}
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public int findKRotation(List<Integer> list) {
        int[] arr = list.stream().mapToInt(i -> i).toArray();
        int lb=0;
        int n=arr.length;
        int ub=n-1;
        int ind=-1;
        int ans=Integer.MAX_VALUE;
        while(lb<=ub){
            if(arr[lb]<=arr[ub]){
                if(ans>arr[lb]){
                    ans=arr[lb];
                    ind=lb;
                }
                break;
            }
            int mid=lb+(ub-lb)/2;
            if(arr[lb]<=arr[mid]){
                if(ans>arr[lb]){
                    ans=arr[lb];
                    ind=lb;
                }
                lb=mid+1;
            }
            else{
                if(ans>arr[mid]){
                    ans=arr[mid];
                    ind=mid;
                }
                ub=mid-1;
            }
        }
        return ind;
    }
}
//{ Driver Code Starts
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine());

        Solution ob = new Solution(); // Instantiate the Solution object once

        while (t-- > 0) {
            String line = scanner.nextLine();
            String[] elements = line.split(" ");
            int[] arr = new int[elements.length]; // Changed to int[]

            for (int i = 0; i < elements.length; i++) {
                arr[i] = Integer.parseInt(elements[i]);
            }

            System.out.println(ob.findMin(arr));
            System.out.println("~");
        }
        scanner.close();
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public int findMin(int[] arr) {
        int lb=0;
        int n=arr.length;
        int ub=n-1;
        int ans=Integer.MAX_VALUE;
        while(lb<=ub){
            int mid=lb+(ub-lb)/2;
            if(arr[lb]<=arr[mid]){
                ans = Math.min(ans,arr[lb]);
                lb=mid+1;
            }
            else{
                ans = Math.min(ans,arr[mid]);
                ub=mid-1;
            }
        }
        return ans;
    }
}

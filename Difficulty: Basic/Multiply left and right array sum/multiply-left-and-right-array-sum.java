//{ Driver Code Starts
import java.util.*;

public class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); // consume the newline character

        while (t-- > 0) {
            String[] input = sc.nextLine().split(" ");
            int[] arr = Arrays.stream(input).mapToInt(Integer::parseInt).toArray();
            Solution ob = new Solution();
            System.out.println(ob.multiply(arr));
        
System.out.println("~");
}

        sc.close();
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public int multiply(int[] arr) {
        int a=0,b=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(i<n/2){
                a+=arr[i];
            }
            else{
                b+=arr[i];
            }
        }
        return a*b;
    }
}

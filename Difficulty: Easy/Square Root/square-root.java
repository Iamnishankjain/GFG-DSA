//{ Driver Code Starts
import java.util.Scanner;

class SquartRoot {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int a = sc.nextInt();
            Solution obj = new Solution();
            System.out.println(obj.floorSqrt(a));
            t--;
        }
    }
}
// } Driver Code Ends


/*You are required to complete
this function*/

// Function to find square root
// x: element to find square root
class Solution {
    int floorSqrt(int n) {
        int lb=1;
        int ub=n/2+1;
        int ans=-1;
        while(lb<=ub){
            int mid=lb+(ub-lb)/2;
            if(mid*mid<=n){
                ans=mid;
                lb=mid+1;
            }
            else{
                ub=mid-1;          
            }
        }
        return ub;
    }
}

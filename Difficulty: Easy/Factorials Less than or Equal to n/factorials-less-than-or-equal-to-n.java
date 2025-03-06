//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long N = sc.nextLong();

            Solution ob = new Solution();
            ArrayList<Long> ans = ob.factorialNumbers(N);
            for (long num : ans) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


// User function Template for Java
class Solution {
    static ArrayList<Long> factorialNumbers(long n) {
        ArrayList<Long> list=new ArrayList<>();
        for(long i=1;i<=n/2+1;i++){
            long temp=fact(i,n,1);
            if(temp==0){
                break;
            }
            else{
                list.add(temp);
            }
        }
        return list;
    }
    
    static long fact(long n,long limit,long store){
        if(n<1){
            return store;
        }
        if(store > limit){
            return 0;
        }
        store*=n;
        return fact(n-1,limit,store);
    }
}
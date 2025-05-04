//{ Driver Code Starts
import java.io.*;
import java.text.DecimalFormat;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {
            double b = sc.nextDouble();
            int e = sc.nextInt();
            Solution ob = new Solution();
            System.out.printf("%.5f\n", ob.power(b, e));
            System.out.println("~");
        }
        sc.close();
    }
}


// } Driver Code Ends

// User function Template for Java
class Solution {
    double power(double x, int n) {
        long nn=n;
        if (nn < 0) {
            nn = -nn;
            return 1.0 / recursive(x, nn);
        } else {
            return recursive(x, nn);
        }
    }

    public double recursive(double x, long n){
        if(n==0){
            return 1.0;
        }

        double half = recursive(x, n / 2);

        if (n % 2 == 0) {
            return half * half;
        } else {
            return half * half * x;
        }
    }
}


//{ Driver Code Starts.
// } Driver Code Ends
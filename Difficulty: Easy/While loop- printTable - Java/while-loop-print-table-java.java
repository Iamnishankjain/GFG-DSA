//{ Driver Code Starts

// } Driver Code Ends

//Back-end complete function Template for Java
import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int start=n*10;
        while(start>=n){
            System.out.print(start+" ");
            start-=n;
        }
    }
}


//{ Driver Code Starts.
// } Driver Code Ends
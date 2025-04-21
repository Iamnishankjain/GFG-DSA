//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt(); // Read the number of test cases
        sc.nextLine();        // Consume the newline character after reading the integer

        while (t-- > 0) {
            String s = sc.nextLine(); // Read the input string

            // Remove surrounding quotes from the string
            String str = s.substring(1, s.length() - 1);

            Solution obj = new Solution(); // Create an object of the Solution class
            String ans = obj.reverseWords(str); // Reverse the words in the string

            // Print the result with surrounding quotes
            System.out.println("\"" + ans + "\"");
        }
        sc.close();
    }
}

// } Driver Code Ends


class Solution {
    // Function to reverse words in a given string
    public String reverseWords(String s) {
        StringBuilder sb=new StringBuilder();
        String str[]=s.trim().replaceAll("\\s+", " ").split(" ");
        int n=str.length;
        reverse(str,n);
        for(int i=0;i<n-1;i++){
            sb.append(str[i]+" ");
        }
        sb.append(str[n-1]);
        return sb.toString();
    }

    public void reverse(String str[],int n){
        for(int i=0;i<n/2;i++){
            String temp=str[i];
            str[i]=str[n-i-1];
            str[n-i-1]=temp;
        }
    }
}

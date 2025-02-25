//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Sorting {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int g = 0; g < t; g++) {
            String[] str = (br.readLine()).trim().split(" ");
            int arr[] = new int[str.length];
            for (int i = 0; i < str.length; i++) arr[i] = Integer.parseInt(str[i]);
            System.out.println(new Solution().inversionCount(arr));
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    // Function to count inversions in the array.
    static int inversionCount(int arr[]) {
        return sort(arr,0,arr.length-1);
    }
    
    static int sort(int arr[],int p,int n){
        if(p<n){
        int mid=(p+n)/2;
        int lc=sort(arr,p,mid);
        int rc=sort(arr,mid+1,n);
        int cc=merge(arr,p,mid,n);
        return lc+rc+cc;
        }
        return 0;
    }
    
    static int merge(int arr[],int st,int mid,int end){
        ArrayList<Integer> list=new ArrayList<>();
        int count=0;
        int i=st,j=mid+1;
        while(i<=mid && j<=end){
            if(arr[i]<=arr[j]){
                list.add(arr[i]);
                i++;
            }
            else{
                list.add(arr[j]);
                count+=(mid-i+1);
                j++;
            }
        }
        
        while(i<=mid){
            list.add(arr[i]);
            i++;
        }
        while(j<=end){
            list.add(arr[j]);
            j++;
        }
        
        for(int k=0;k<list.size();k++){
            arr[k+st]=list.get(k);
        }
        return count;
    }
}
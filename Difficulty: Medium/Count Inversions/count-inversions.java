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
    static int count;
    static int inversionCount(int arr[]) {
        count=0;
        sort(arr,0,arr.length-1);
        return count;
    }

    public static void sort(int []arr,int p,int q){
        if(p<q){
            int mid=p+(q-p)/2;
            sort(arr,p,mid);
            sort(arr,mid+1,q);
            merge(arr,p,mid,q);
        }
    }

    public static void merge(int []arr,int p,int mid,int q){
        int n1=mid-p+1;
        int n2=q-mid;

        int left[]=new int[n1];
        int right[]=new int[n2];

        for(int i=0;i<n1;i++){
            left[i]=arr[p+i];
        }
        for(int j=0;j<n2;j++){
            right[j]=arr[mid+j+1];
        }
        int i=0,j=0,k=p;
        while(i<n1 && j<n2){
            if(left[i]<=right[j]){
                arr[k++]=left[i++];
            }
            else{
                arr[k++]=right[j++];
                count += (n1 - i);
            }
        }
        while(i<n1){
            arr[k++]=left[i++];
        }
        while(j<n2) arr[k++]=right[j++];

    }
}
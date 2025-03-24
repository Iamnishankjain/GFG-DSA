//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.lang.*;
import java.util.*;


// } Driver Code Ends

class Solution {
    public static boolean Search(int[] nums, int target) {
        int n=nums.length;
        int lb=0;
        int ub=n-1;
        while(lb<=ub){
            int mid=lb+(ub-lb)/2;
            if(nums[mid]==target){
                return true;
            }
            if(nums[mid]==nums[lb] && nums[lb]==nums[ub]){
                lb++;
                ub--;
                continue;
            }
            if(nums[lb]<=nums[mid]){
                if(nums[lb]<=target && nums[mid]>=target){
                    ub=mid-1;
                }
                else{
                    lb=mid+1;
                }
            }
            else{
                if(nums[mid]<=target && nums[ub]>=target){
                    lb=mid+1;
                }
                else{
                    ub=mid-1;
                }
            }
        }
        return false;
    }
}



//{ Driver Code Starts.

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int k = Integer.parseInt(br.readLine());
            String line = br.readLine();
            String[] tokens = line.split(" ");

            // Create an ArrayList to store the integers
            ArrayList<Integer> array = new ArrayList<>();

            // Parse the tokens into integers and add to the array
            for (String token : tokens) {
                array.add(Integer.parseInt(token));
            }

            int[] arr = new int[array.size()];
            int idx = 0;
            for (int i : array) arr[idx++] = i;
            Solution obj = new Solution();
            boolean res = obj.Search(arr, k);
            if (res)
                System.out.println("true");
            else
                System.out.println("false");

            // System.out.println(res);

            System.out.println("~");
        }
    }
}

// } Driver Code Ends
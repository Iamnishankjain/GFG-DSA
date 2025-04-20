//{ Driver Code Starts
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // Number of test cases
        sc.nextLine();        // Consume the newline character

        while (t-- > 0) {
            String input = sc.nextLine();

            // Replace ][ with ],[
            input = input.replace("][", "],[");

            ArrayList<ArrayList<Integer>> mat = new ArrayList<>();
            String[] rows = input.split("],\\s*\\[");

            for (String row : rows) {
                row = row.replaceAll("[\\[\\]]", ""); // Remove any surrounding brackets
                ArrayList<Integer> intRow = new ArrayList<>();
                for (String num : row.split(",")) {
                    intRow.add(Integer.parseInt(num.trim()));
                }
                mat.add(intRow);
            }

            Solution obj = new Solution();
            int result = obj.rowWithMax1s(convertListToArray(mat));

            System.out.println(result);

            System.out.println("~");
        }
        sc.close();
    }

    // Helper method to convert ArrayList<ArrayList<Integer>> to 2D array
    public static int[][] convertListToArray(ArrayList<ArrayList<Integer>> mat) {
        int rows = mat.size();
        int cols = mat.get(0).size();
        int[][] arr = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = mat.get(i).get(j);
            }
        }
        return arr;
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public int rowWithMax1s(int arr[][]) {
        int n=arr.length;
        int max=-1;
        int ind=-1;
        for(int i=0;i<n;i++){
            int count=getCount(arr[i]);
            if(count>max){
                max=count;
                ind=i;
            }
        }
        return ind;
    }
    
    public int getCount(int arr[]){
        int low=0;
        int n=arr.length;
        int high=n-1;
        int f=n;
        while(low<=high){
            int mid=(low+high)/2;
            
            if(arr[mid]==1){
                f=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return n-f;
    }
}
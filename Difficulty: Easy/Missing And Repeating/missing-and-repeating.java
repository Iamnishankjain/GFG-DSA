//{ Driver Code Starts
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList; // Import ArrayList
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            String input = br.readLine();
            String[] inputs = input.split(" ");
            int[] arr = new int[inputs.length];

            for (int i = 0; i < inputs.length; i++) {
                arr[i] = Integer.parseInt(inputs[i]);
            }

            // Get the result as an ArrayList<Integer>
            ArrayList<Integer> ans = new Solution().findTwoElement(arr);
            System.out.println(ans.get(0) + " " + ans.get(1));
            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java
class Solution {
    // Function to find two elements in array
    ArrayList<Integer> findTwoElement(int arr[]) {
         int n = arr.length;
        long sn = (long) n * (n + 1) / 2; 
        long s2n = (long) n * (n + 1) * (2 * n + 1) / 6;

        long s = 0, s2 = 0;
        for (int i = 0; i < n; i++) {
            s += arr[i];
            s2 += (long) arr[i] * arr[i];
        }

        long val1 = s - sn;  // x - y
        long val2 = (s2 - s2n) / val1;  // x + y

        int x = (int) ((val1 + val2) / 2);  // Repeating number
        int y = (int) (x - val1);  // Missing number

        ArrayList<Integer> list = new ArrayList<>();
        list.add(x);
        list.add(y);
        return list;
    }
}

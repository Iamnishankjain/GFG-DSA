//{ Driver Code Starts
import java.lang.Math;
import java.util.Scanner;

class Convert_To_Five {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            System.out.println(new Solution().convertfive(N));
            T--;
        
System.out.println("~");
}
    }
}
// } Driver Code Ends


class Solution {
    int convertfive(int num) {
        StringBuilder sb=new StringBuilder("");
        sb.append(num);
        for(int i=0;i<sb.length();i++){
            if(sb.charAt(i)=='0'){
                sb.setCharAt(i, '5');
            }
        }
        
        return Integer.parseInt(sb.toString());
    }
}
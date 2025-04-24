//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            //br.readLine();
            String s;
            s = br.readLine();
            
            Solution obj = new Solution();
            int res = obj.beautySum(s);
            
            System.out.println(res);
            
        
System.out.println("~");
}
    }
}

// } Driver Code Ends


class Solution {
    public static int beautySum(String s) {
        int ans=0;
        int n=s.length();
        for(int size=3;size<=n;size++){
            int i=0;
            int j=size;
            int freq[]=new int[26];
            for(int k=i;k<j;k++){
                freq[s.charAt(k)-'a']++;
            }
            ans+=beauty(freq);
            while(j<n){
                freq[s.charAt(j)-'a']++;
                freq[s.charAt(i)-'a']--;
                ans+=beauty(freq);
                i++;
                j++;
            }
        }
        return ans;
    }
    public static int beauty(int[] freq){
        int max=0;
        int n=freq.length;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(freq[i]!=0){
                max=Math.max(max,freq[i]);
                min=Math.min(min,freq[i]);
            }
        }
        return max-min;
    }
}
        

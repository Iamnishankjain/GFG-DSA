//{ Driver Code Starts
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.Arrays;

public class Driver {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while (tc-- > 0) {
            String s1 = br.readLine();
            String s2 = br.readLine();

            Solution obj = new Solution();

            boolean a = obj.areIsomorphic(s1, s2);
            if (a)
                System.out.println("true");
            else
                System.out.println("false");

            System.out.println("~");
        }
    }
}

// } Driver Code Ends


class Solution {
    // Function to check if two strings are isomorphic.
    public static boolean areIsomorphic(String s, String t) {
        HashMap<Character,Character> map=new HashMap<>();

        for(int i=0;i<s.length();i++){
            char ori=s.charAt(i);
            char rep=t.charAt(i);
            if(!map.containsKey(ori)){
                if(!map.containsValue(rep)){
                    map.put(ori,rep);
                }
                else{
                    return false;
                }
            }
            else{
                char value=map.get(ori);
                if(value!=rep){
                    return false;
                }
            }
        }
        return true;
    }
}
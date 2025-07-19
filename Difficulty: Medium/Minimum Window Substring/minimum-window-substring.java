// User function Template for Java

class Solution {
    static String minWindow(String s, String t) {
        // code here
        int st=-1,end=-1,minlen=Integer.MAX_VALUE;
        int i=0,j=0,k=0;
        int n=s.length();
        int m=t.length();

        while(j<n && k<m){

            if(s.charAt(j)==t.charAt(k)){
                k++;
            }
            if(k==m){
                i=j;
                k=m-1;
                while(i>=0 && k>=0){
                    if(s.charAt(i)==t.charAt(k)){
                        k--;
                    }
                    i--;
                }
                i++; 
                if(minlen>(j-i+1)){
                    minlen=(j-i+1);
                    st=i;
                    end=j;
                }   
                k=0;
                j=i+1;
            }
            j++;
        }
        return st==-1 ? "" : s.substring(st,end+1);
    }
}

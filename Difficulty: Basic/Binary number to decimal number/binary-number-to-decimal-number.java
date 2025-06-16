// User function Template for Java

class Solution {
    public int binaryToDecimal(String b) {
        // Code here
        int sum=0;
        int n=b.length();
        for(int i=0;i<n;i++){
            if(b.charAt(i)=='1'){
                sum+=Math.pow(2,n-(i+1));
            }
        }
        return sum;
    }
}
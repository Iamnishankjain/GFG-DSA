// User function Template for Java

class Solution {
    public int binaryToDecimal(String b) {
        // Code here
        int sum=0;
        int n=b.length();
        int p2=1;
        for(int i=n-1;i>=0;i--){
            if(b.charAt(i)=='1'){
                sum+=p2;
            }
            p2=p2*2;
        }
        return sum;
    }
}
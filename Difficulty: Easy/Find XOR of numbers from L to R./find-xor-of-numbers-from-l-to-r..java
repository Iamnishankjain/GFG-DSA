// User function Template for Java

class Solution {
    public static int findXOR(int l, int r) {
        int lXor=xor(l-1);
        int rXor=xor(r);
        return lXor^rXor;
    }
    public static int xor(int n){
        if(n%4==1) return 1;
        if(n%4==2) return n+1;
        if(n%4==3) return 0;
        else return n;
    }
}
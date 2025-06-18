// User function Template for Java
class Solution {
    static int setKthBit(int n, int k) {
        // code here
        n=n|(1<<k);
        return n;
    }
}
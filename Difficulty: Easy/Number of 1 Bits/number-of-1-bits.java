// User function Template for Java
class Solution {
    static int setBits(int n) {
        int c=0;
        while(n!=0){
            c+=n&1;
            n/=2;
        }
        return c;
    }
}
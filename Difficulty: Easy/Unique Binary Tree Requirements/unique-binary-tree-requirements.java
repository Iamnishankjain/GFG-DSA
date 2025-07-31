// User function Template for Java

class Solution {

    public static boolean isPossible(int a, int b) {
        // Code here
        if(a==2 || b==2){
            if((a==2 && b==1)  || (a==2 && b==3) || (b==2 && a==1)  || (b==2 && a==3)) return true;
        }
        return false;
    }
}
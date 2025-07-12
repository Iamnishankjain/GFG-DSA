class Solution {
    public int reverseExponentiation(int x) {
        long n=rev(x);
        int ans=1;
        int sign= n>=0 ? 1 : -1;
        if(n<0){
            n=-n;
        }
        while(n>0){
            if(n%2==1){
                ans*=x;
                n=n-1;
            }
            else{
                n=n/2;
                x=x*x;
            }
        }
        
        return sign==1 ? ans : (1/ans);
    }
    public int rev(int n){
        int rev=0;
        while(n!=0){
            int rem=n%10;
            rev=rev*10+rem;
            n/=10;
        }
        return rev;
    }
}

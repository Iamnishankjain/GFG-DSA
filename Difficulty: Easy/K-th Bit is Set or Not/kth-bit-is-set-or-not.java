class CheckBit {
    static boolean checkKthBit(int n, int k) {
        // Your code here
        int i=0;
        while(i<k){
            n=n>>1;
            i++;
        }
        if((n&1)==1){
            return true;
        }
        else{
            return false;
        }
    }
}
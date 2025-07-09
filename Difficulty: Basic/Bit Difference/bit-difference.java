class Solution {
    public static int countBitsFlip(int a, int b) {
        int num=a^b;
        int cnt=0;
        while(num!=0){
            num=num&(num-1);
            cnt++;
        }
        return cnt;
    }
}

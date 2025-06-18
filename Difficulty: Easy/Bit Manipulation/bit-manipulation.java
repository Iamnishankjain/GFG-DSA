// User function Template for Java

class Solution {
    static void bitManipulation(int num, int i) {
        // code here
        int temp=num;
        temp=num>>(i-1);
        if((temp&1)==1){
            System.out.print(1+" ");
        }
        else{
            System.out.print(0+" ");
        }
        System.out.print((num|(1<<(i-1)))+" ");
        System.out.print((num&(~(1<<(i-1))))+" ");
    }
}

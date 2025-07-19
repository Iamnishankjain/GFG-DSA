// User function Template for Java

class Solution {
    static boolean lemonadeChange(int N, int bills[]) {
        // code here
        int five=0,ten=0;
        for(int i=0;i<bills.length;i++){
            if(bills[i]==5) five++;
            else if(bills[i]==10){
                if(five==0) return false;
                five--;
                ten++;
            }else{
                if(ten!=0 && five!=0){
                    ten--;
                    five--;
                }else if(five>=3) five-=3;
                else return false;
            }
        }
        return true;
    }
}

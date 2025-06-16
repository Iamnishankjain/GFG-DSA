class Solution {
    static String decToBinary(int num) {
        StringBuilder sb=new StringBuilder();
        while(num!=0){
            int rem=num%2;
            num=num/2;
            sb.insert(0,rem);
        }
        return sb.toString();
    }
}
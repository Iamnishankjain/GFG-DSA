// User function Template for Java

class Solution {
    static int minCandy(int ratings[]) {
        // code here
        int sum=1,i=1;
        int n=ratings.length;
        while(i<n){
            if(ratings[i]==ratings[i-1]){
                sum+=1;
                i++;
                continue;
            }
            int peak=1;
            while(i<n && ratings[i]>ratings[i-1]){
                peak++;
                sum+=peak;
                i++;
            }
            int down=1;
            while(i<n && ratings[i]<ratings[i-1]){
                sum+=down;
                down++;
                i++;
            }
            if(down>peak) sum+=down-peak;
        }
        return sum; 
    }
}

class Solution {
    public static void print_divisors(int n) {
        // code here
        print(1,n);
        
    }
    
    public static void print(int i,int n){
        if(i*i>n){
            return;
        }
        if(n%i==0){
            System.out.print(i+" ");
            print(i+1,n);
            if((n/i)!=i)
                System.out.print(n/i+" ");
        }
        else{
            print(i+1,n);
        }
    }
}

// User function Template for Java

class Solution {
    // You must implement this function
    static void sieve() {
       
    }

    static List<Integer> findPrimeFactors(int n) {
       List<Integer> list=new ArrayList<>();
       int arr[]=new int[n+1];
       for(int i=2;i<=n;i++){
           if(n%i==0){
               arr[i]=i;
           }
       }
       for(int i=2;i*i<=n;i++){
           if(arr[i]==i){
               for(int j=i*i;j<=n;j+=i){
                   if(arr[j]>i)
                    arr[j]=i;
               }
           }
        }
        while(n!=1){
           list.add(arr[n]);
           n/=arr[n];
        }
       return list;
    }
}

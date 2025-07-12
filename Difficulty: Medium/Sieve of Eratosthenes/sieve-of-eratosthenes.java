class Solution {
    public int[] sieve(int n) {
       List<Integer> list=new ArrayList<>();
       int arr[]=new int[n+1];
       for(int i=2;i<=n;i++) arr[i]=1;
       for(int i=2;i*i<=n;i++){
           if(arr[i]==1){
               for(int j=i*i;j<=n;j+=i){
                   arr[j]=0;
               }
           }
        }
        for(int i=2;i<=n;i++) if(arr[i]==1) list.add(i);
        int prime[]=new int[list.size()];
        for(int i=0;i<list.size();i++){
            prime[i]=list.get(i);
        }
        return prime;
    }
}
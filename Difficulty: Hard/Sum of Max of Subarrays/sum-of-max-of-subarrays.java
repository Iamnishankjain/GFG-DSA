class Solution {
    public int sumOfMax(int[] arr) {
        // code here
        int n=arr.length;
        
        int nge[]=nge(arr,n);
        int pgee[]=pgee(arr,n);
        int total=0;
        for(int i=0;i<n;i++){
            int left=i-pgee[i];
            int right=nge[i]-i;
            total+=(left*right*arr[i]);
        }
        return total;
    }
    
    public int[] nge(int[] arr,int n){
        Stack<Integer> stack=new Stack<>();
        int nge[]=new int[n];
        for(int i=n-1;i>=0;i--){
            while(!stack.isEmpty() && arr[stack.peek()]<=arr[i]){
                stack.pop();
            }
            nge[i]=stack.isEmpty() ? n : stack.peek();
            stack.push(i);
        }
        return nge;
    }
    public int[] pgee(int[] arr,int n){
        Stack<Integer> stack=new Stack<>();
        int pgee[]=new int[n];
        for(int i=0;i<n;i++){
            while(!stack.isEmpty() && arr[stack.peek()]<arr[i]){
                stack.pop();
            }
            pgee[i]=stack.isEmpty() ? -1 : stack.peek();
            stack.push(i);
        }
        return pgee;
    }
}
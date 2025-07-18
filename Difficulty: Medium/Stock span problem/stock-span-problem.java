
class Solution {
    public ArrayList<Integer> calculateSpan(int[] arr) {
        ArrayList<Integer> list=new ArrayList<>();
        StockSpanner sp=new StockSpanner();
        for(int i=0;i<arr.length;i++){
            list.add(sp.next(arr[i]));
        }
        return list;
    }
}

class StockSpanner {
    Stack<int[]> stack=new Stack<>();
    int ind;
    public StockSpanner() {
       stack.clear();
        ind=-1;
    }
    
    public int next(int val) {
        ind++;
        while(!stack.isEmpty() && stack.peek()[0]<=val){
            stack.pop();
        }
        int ans=ind-(stack.isEmpty() ? -1 : stack.peek()[1]);
        stack.push(new int[]{val,ind});
        return  ans;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */
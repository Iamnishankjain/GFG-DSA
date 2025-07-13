class Solution {
    public Solution() {}

    Stack<Long> s=new Stack<>();
    long min;
    public void push(int val) {
        if(s.isEmpty()){
            min=(long)val;
            s.push((long)val);
        }
        else{
            if(min<=val) s.push((long)val);
            else{
                s.push(2*(long)val-min);
                min=(long)val;
            }
        }
    }
    
    public void pop() {
        if(s.size()==0) return;
        long x=s.pop();
        if(x<min){
            min=2*min-x;
        }
        if (s.isEmpty()) {
            min = 0; 
        }
    }
    
    public int peek() {
        if(s.size()==0) return -1;
        long x=s.peek();
        if(min<x) return (int)x;
        else return (int)min;
    }
    
    public int getMin() {
        if (s.isEmpty()) return -1;
        return (int)min;
    }
}
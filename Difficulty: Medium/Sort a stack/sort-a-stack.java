/*Complete the function below*/
class GfG {
    public Stack<Integer> sort(Stack<Integer> s) {
        sorting(s);
        return s;
    }
    
    public void sorting(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int top=s.pop();
        sorting(s);
        insert(s,top);
    }
    
    public void insert(Stack<Integer> s,int ele){
        if(s.isEmpty() || s.peek()<=ele){
            s.push(ele);
        }
        else{
            int top=s.pop();
            insert(s,ele);
            s.push(top);
        }
    }
}
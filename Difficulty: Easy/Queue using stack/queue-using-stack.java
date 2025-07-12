class Queue {
    Stack<Integer> s1 = new Stack<Integer>();
    Stack<Integer> s2 = new Stack<Integer>();

    int dequeue() {
        if(s1.size()==0) return -1;
        return s1.pop();
    }

    void enqueue(int x) {
        if(s1.isEmpty()) s1.push(x);
        else{
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
            s1.push(x);
            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }
        }
    }
}

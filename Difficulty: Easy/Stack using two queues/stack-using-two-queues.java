class Queues {
    Queue<Integer> q1 = new LinkedList<Integer>();
    Queue<Integer> q2 = new LinkedList<Integer>();

    void push(int a) {
        if(q1.isEmpty()){
            q2.add(a);
        }else{
            q1.add(a);
        }
    }

    int pop() {
        int temp=-1;
        if(q1.isEmpty() && q2.isEmpty()){
            return -1;
        }
        if(q1.isEmpty()){
            while(q2.size()!=1){
                q1.add(q2.poll());
            }
            temp=q2.poll();
        }
        else{
            while(q1.size()!=1){
                q2.add(q1.poll());
            }
            temp=q1.poll();
        }
        return temp;
    }
}
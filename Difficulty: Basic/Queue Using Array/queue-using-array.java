class MyQueue {

    int front, rear;
    int arr[] = new int[100005];
    int curr=0;
    MyQueue() {
        front = 0;
        rear = 0;
    }

    // Function to push an element x in a queue.
    void push(int x) {
        if(curr==0){
            front = 0;
            rear = -1;
        }
        rear=(rear+1)%100005;
        arr[rear]=x;
        curr++;
    }

    // Function to pop an element from queue and return that element.
    int pop() {
        if(curr==0){
            return -1;
        }
        int temp=arr[front];
        if(curr==1){
            front=-1;
            rear=-1;
        }
        else{
            front=(front+1)%100005;
        }
        curr--;
        return temp;
    }
}
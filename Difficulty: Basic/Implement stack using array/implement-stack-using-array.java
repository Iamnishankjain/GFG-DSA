class MyStack {
    private int[] arr;
    private int top;

    public MyStack() {
        arr = new int[1000];
        top = -1;
    }

    public void push(int x) {
        if(top<1000-1){
            top++;
            arr[top]=x;
        }
    }

    public int pop() {
        int temp=-1;
        if(top!=-1){
            temp=arr[top];
            arr[top]=-1;
            top--;
        }
        return temp;
    }
}
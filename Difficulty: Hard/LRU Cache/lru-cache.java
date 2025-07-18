class LRUCache {
    static class Node{
        int data,key;
        Node next,prev;
        Node(int key,int data){
            this.key=key;
            this.data=data;
            next=null;
            prev=null;
        }
    }
    static Map<Integer,Node> map;
    static Node head=null,tail=null;
    static int cap;
    LRUCache(int capacity) {
        map=new HashMap<>();
        cap=capacity;
        dummyLL();
    }

    public static int get(int key) {
        if(map.containsKey(key)){
            Node access=map.get(key);
            delete(access);
            insertafterhead(access);
            return access.data;
        }else{
            return -1;
        }
    }

        
    public static void put(int key, int value) {
        Node newNode=new Node(key,value);
        if(map.containsKey(key)){
            Node temp=map.get(key);
            temp.data=value;
            delete(temp);
            insertafterhead(temp);
            map.put(key,temp);
        }
        else{
            if(map.size()<cap){
                insertafterhead(newNode);
            }
            else{
                Node temp=tail.prev;
                delete(temp);
                map.remove(temp.key);
                insertafterhead(newNode);
            }
            map.put(key,newNode);
        }
    }

    public static void insertafterhead(Node newNode){
        newNode.next=head.next;
        newNode.prev=head;
        head.next=newNode;
        newNode.next.prev=newNode;
    }
    public static void delete(Node node){
        node.prev.next=node.next;
        node.next.prev=node.prev;
    }
    public static void dummyLL(){
        head=new Node(-1,-1);
        tail=new Node(-1,-1);
        head.next=tail;
        tail.prev=head;
    }
}
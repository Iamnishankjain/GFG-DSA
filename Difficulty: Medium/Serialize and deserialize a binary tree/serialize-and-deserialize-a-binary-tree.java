/*Complete the given function
Node is as follows:
class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}*/

class Tree {
    // Function to serialize a tree and return a list containing nodes of tree.
    public ArrayList<Integer> serialize(Node root) {
        ArrayList<Integer> list=new ArrayList<>();
        if(root==null) return list;
        Queue<Node> q=new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            Node curr=q.poll();
            if(curr==null) {
                list.add(-1);
                continue;
            }
            list.add(curr.data);
            q.offer(curr.left);
            q.offer(curr.right);
        }
        return list;
        
    }

    // Function to deserialize a list and construct the tree.
    public Node deSerialize(ArrayList<Integer> arr) {
        
        int n=arr.size();
        if(n==0) return null;
        int ind=0;
        Node root=new Node(arr.get(ind++));
        Queue<Node> q=new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            Node curr=q.poll();
            if(ind<n && arr.get(ind)!=-1){
                curr.left=new Node(arr.get(ind));
                q.offer(curr.left);
            }
            ind++;
            if(ind<n && arr.get(ind)!=-1){
                curr.right=new Node(arr.get(ind));
                q.offer(curr.right);
            }
            ind++;
        }
        return root;
    }
};
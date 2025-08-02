/* class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
} */

class Tree {
    int findCeil(Node root, int key) {
        // code here
        if(root==null) return -1;
        int ceil=-1;
        
        while(root!=null){
            if(root.data==key) return key;
            else if(root.data<key) root=root.right;
            else{
                ceil=root.data;
                root=root.left;
            }
        }
        return ceil;
    }
}
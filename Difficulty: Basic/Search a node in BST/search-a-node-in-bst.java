class BST {
    // Function to search a node in BST.
    boolean search(Node root, int val) {
        // Your code here
        if(root==null) return false;
        if(root.data==val) return true;
        if(root.data>val){
            return search(root.left,val);
        }
        else{
            return search(root.right,val);
        }
    }
}
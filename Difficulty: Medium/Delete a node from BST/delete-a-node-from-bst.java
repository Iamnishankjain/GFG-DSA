class Tree {
    // Function to delete a node from BST.
    public static Node deleteNode(Node root, int key) {
        if(root==null) return null;
        if(root.data<key){
            root.right=deleteNode(root.right,key);
        }
        else if(root.data>key){
            root.left=deleteNode(root.left,key);
        }
        else{
            if(root.left==null && root.right==null) return null;
            else if(root.left==null) return root.right;
            else if(root.right==null) return root.left;
            else{
                Node pre = getPre(root.left);
                int d=pre.data;
                root.left=deleteNode(root.left,d);
                root.data=d;
            }
        }
        return root;
    }
    public static Node getPre(Node node){
        while(node.right!=null){
            node=node.right;
        }
        return node;
    }
}
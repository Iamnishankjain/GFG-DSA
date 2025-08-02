class Solution {
    // Function to insert a node in a BST.
    Node insert(Node root, int val) {
        // your code here
        if(root==null){
            return new Node(val);
        }
        Node curr=root;
        while(curr!=null){
            if(curr.data<val){
                if(curr.right!=null) curr=curr.right;
                else {
                    curr.right=new Node(val);
                    break;
                }
            }else if(curr.data>val){
                if(curr.left!=null) curr=curr.left;
                else {
                    curr.left=new Node(val);
                    break;
                }
            }
            else{
                return root;
            }
        }
        return root;
    }
}
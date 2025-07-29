/* A Binary Tree node
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}*/

class Solution {
    // Function to return the lowest common ancestor in a Binary Tree.
    Node lca(Node root, int p, int q) {
        // Your code here
        if(root==null) return null;
        if(root.data==p || root.data==q){
            return root;
        }
        Node left=lca(root.left,p,q);
        Node right=lca(root.right,p,q);
        if(left==null) return right;
        else if(right==null) return left;
        else return root;
    }
}
/*
class Node
{
    int data;
    Node left, right;

    public Node(int d)
    {
        data = d;
        left = right = null;
    }
}
*/

class Solution {
    Node LCA(Node root, Node p, Node q) {
        if(root==null || p==root || q==root) return root;
        if(root.data<p.data && root.data<q.data) return LCA(root.right,p,q);
        else if(root.data>p.data && root.data>q.data) return LCA(root.left,p,q);
        else return root;
    }
}
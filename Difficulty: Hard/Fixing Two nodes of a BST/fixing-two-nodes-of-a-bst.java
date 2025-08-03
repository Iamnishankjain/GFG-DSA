/*
class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
*/

class Solution {
    private Node first=null;
    private Node second=null;
    private Node prev=null;
    void correctBST(Node root) {
        if(root==null) return;
        fix(root);
        if(first!=null && second!=null){
            swap(first,second);
        }
    }

    public void fix(Node root){
        if(root==null) return;
        fix(root.left);
        if(prev!=null && prev.data>root.data){
            if(first==null){
                first=prev;
            }
            second=root;
        }
        prev=root;
        fix(root.right);
    }
    public void swap(Node a, Node b) {
    int temp = a.data;
    a.data = b.data;
    b.data = temp;
    }
}
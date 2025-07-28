/*
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}

*/
class Solution {
    public boolean isSymmetric(Node root) {
        // Code here
        if(root==null) return true;
        return check(root.left,root.right);
    }

    public boolean check(Node r1,Node r2){
        if(r1==null && r2==null) return true;
        if(r1==null || r2==null) return false;
        if(r1.data != r2.data) return false;
        return check(r1.left,r2.right) && check(r1.right,r2.left); 
    }
}
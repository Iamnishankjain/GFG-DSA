/*
class Node {
    int data;
    Node left;
    Node right;

    Node(int val) {
        data = val;
        left = right = null;
    }
}
*/

class Solution {
    // Function to check whether a Binary Tree is BST or not.
    boolean isBST(Node root) {
        return check(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }
    public static boolean check(Node root,long i,long j){
        if(root==null) return true;
        if(root.data<=i || root.data>=j) return false;
        return check(root.left,i,root.data) && check(root.right,root.data,j);
    }
}
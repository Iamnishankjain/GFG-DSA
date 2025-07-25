/*
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
 */

class Solution {
    // Function to find the height of a binary tree.
    int height(Node root) {
        // code here
        if(root==null) return -1;
        return 1+Math.max(height(root.left),height(root.right));
    }
}
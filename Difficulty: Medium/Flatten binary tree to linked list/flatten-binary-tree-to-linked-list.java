// User function Template for Java

class Solution {
    private Node prev=null;
    public void flatten(Node root) {
        prev = null;
        flattenTree(root);
    }

    private void flattenTree(Node root) {
        if (root == null) return;

        flattenTree(root.right);
        flattenTree(root.left);

        root.right = prev;
        root.left = null;
        prev = root;
    }
}
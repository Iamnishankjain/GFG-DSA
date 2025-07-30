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
} */
class Solution {
    // Function to get the maximum width of a binary tree.
    int getMaxWidth(Node root) {
        if (root == null) return 0;
        
        int maxWidth = 0;
        Queue<Node> q = new LinkedList<>();
        q.offer(root);

        while (!q.isEmpty()) {
            int levelSize = q.size(); 
            maxWidth = Math.max(maxWidth, levelSize);

            for (int i = 0; i < levelSize; i++) {
                Node current = q.poll();
                if (current.left != null) q.offer(current.left);
                if (current.right != null) q.offer(current.right);
            }
        }

        return maxWidth;
    }
}

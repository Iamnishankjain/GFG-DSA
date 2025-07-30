/*Complete the function below
Node is as follows:
class Node{
    int data;
    Node left,right;

    Node(int key)
    {
        data = key;
        left = right = null;
    }
}

*/
class Solution {
    // Function to check whether all nodes of a tree have the value
    // equal to the sum of their child nodes.
    public static int isSumProperty(Node root) {
        if(root==null || root.left==null && root.right==null) return 1;
        
        int leftVal=(root.left!=null) ? root.left.data : 0;
        int rightVal=(root.right!=null) ? root.right.data : 0;
        if(root.data!=leftVal+rightVal) return 0;
        
        int left=isSumProperty(root.left);
        int right=isSumProperty(root.right);
        if(left==1 && right==1){
            return 1;
        }
        else return 0;
    }
}
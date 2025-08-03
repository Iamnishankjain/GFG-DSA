/*Complete the function below
Node is as follows:
class Node{
    int data;
    Node left,right;
    Node(int d){
        data=d;
        left=right=null;
    }
}
*/
class Solution {
    public int inorderSuccessor(Node root, Node x) {
        if(root==null) return -1;
        int val=-1;
        while(root!=null){
            if(root.data<=x.data){
                root=root.right;
            }
            else if(root.data>x.data){
                val=root.data;
                root=root.left;
            }
        }
        return val;
    }
}
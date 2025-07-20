/* A Binary Tree node
class Node {
    int data;
    Node left, right;
   Node(int item)    {
        data = item;
        left = right = null;
    }
} */

class Solution {
    // Function to return a list containing the postorder traversal of the tree.
    ArrayList<Integer> postOrder(Node root) {
        ArrayList<Integer> list=new ArrayList<>();
        post(root,list);
        return list;
    }
    
    static void post(Node root,ArrayList<Integer> list){
        if(root == null) return;
        post(root.left,list);
        post(root.right,list);
        list.add(root.data);
    }
}
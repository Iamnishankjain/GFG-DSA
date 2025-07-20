/* A Binary Tree node

class Node {
    int data;
    Node left, right;
   Node(int item)    {
        data = item;
        left = right = null;
    }
}
*/
class Solution {
    // Function to return a list containing the inorder traversal of the tree.
    ArrayList<Integer> inOrder(Node root) {
        ArrayList<Integer> list=new ArrayList<>();
        in(root,list);
        return list;
    }
    
    static void in(Node root,ArrayList<Integer> list){
        if(root == null) return;
        in(root.left,list);
        list.add(root.data);
        in(root.right,list);
    }
}
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
       Node curr=root;
       while(curr!=null){
           if(curr.left==null){
                list.add(curr.data);
                curr=curr.right;
           }
           else{
               Node ip=getIP(curr);
               if(ip.right==null){
                   ip.right=curr;
                   curr=curr.left;
               }
               else{
                   ip.right=null;
                   list.add(curr.data);
                   curr=curr.right;
               }
           }
       }
       return list;
    }
    Node getIP(Node root){
        Node curr=root.left;
        while(curr.right!=null && curr.right != root){
            curr=curr.right;
        }
        return curr;
    }
}
/* BST Node
class Node {
    int data;
    Node left, right;
    Node(int x) {
        data = x;
        left = right = null;
    }
} */

class Solution {
    public ArrayList<Node> findPreSuc(Node root, int key) {
        ArrayList<Node> list=new ArrayList<>();
        list.add(inorderPre(root,key));
        list.add(inorderSuccessor(root,key));
        return list;
    }
    public Node inorderSuccessor(Node root, int x) {
        Node val=null;
        while(root!=null){
            if(root.data<=x){
                root=root.right;
            }
            else if(root.data>x){
                val=root;
                root=root.left;
            }
        }
        return val;
    }
    public Node inorderPre(Node root, int x) {
        Node val=null;
        while(root!=null){
            if(root.data<x){
                val=root;
                root=root.right;
            }
            else{
                root=root.left;
            }
        }
        return val;
    }
}
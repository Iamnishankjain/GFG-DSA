/*
class Node {
    int data;
    Node left, right;

    public Node(int data){
        this.data = data;
    }
}
*/
class Solution {
    public static int findMax(Node root) {
        // code here
        if(root==null) return -1;
        while(root.right!=null){
            root=root.right;
        }
        return root.data;
    }
    

    public static int findMin(Node root) {
        
        if(root==null) return -1;
        while(root.left!=null){
            root=root.left;
        }
        return root.data;
    }
}
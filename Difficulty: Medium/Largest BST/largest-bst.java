// class Node
// {
//     int data;
//     Node left, right;

//     public Node(int d)
//     {
//         data = d;
//         left = right = null;
//     }
// }

class Solution {
    static class NodeValue{
        int large;
        int small;
        int size;
        NodeValue(int large,int small,int size){
            this.large=large;
            this.small=small;
            this.size=size;
        }
    }
    // Return the size of the largest sub-tree which is also a BST
    static int largestBst(Node root) {
        return helper(root).size;
    }
    
    static NodeValue helper(Node root){
        if(root==null) return new NodeValue(Integer.MIN_VALUE,Integer.MAX_VALUE,0);
        
        NodeValue left=helper(root.left);
        NodeValue right=helper(root.right);
        
        if(left.large<root.data && right.small>root.data){
            return new NodeValue(Math.max(right.large,root.data),
            Math.min(left.small,root.data),1+left.size+right.size);
        }
        
        return new NodeValue(Integer.MAX_VALUE,Integer.MIN_VALUE,Math.max(left.size,right.size));
    }
}
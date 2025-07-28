/*
class Node
{
    int data;
    Node left, right;

    public Node(int d)
    {
        data = d;
        left = right = null;
    }
}
*/

class Solution {
    ArrayList<Integer> boundaryTraversal(Node node) {
        // code here
        ArrayList<Integer> list=new ArrayList<>();
        if(node==null) return list;
        ArrayList<Integer> right=new ArrayList<>();
        if (node.left!=null || node.right!=null) list.add(node.data);
        left(node.left,list);
        inorder(node,list);
        right(node.right,right);
        list.addAll(right);
        return list;
    }
    void left(Node root,ArrayList<Integer> list){
        if(root==null) return;
        if(root.left==null && root.right==null) return;
        list.add(root.data);
        if(root.left==null){
            left(root.right,list);
        }
        else{
            left(root.left,list);
        }
    }
    
    void inorder(Node root,ArrayList<Integer> list){
        if(root.left==null && root.right==null){
            list.add(root.data);
            return;
        }
        if(root.left!=null) inorder(root.left,list);
        if(root.right!=null) inorder(root.right,list);
    }
    
    void right(Node root,ArrayList<Integer> list){
        if(root==null) return;
        if(root.left==null && root.right==null) return;
        list.add(0,root.data);
        if(root.right==null){
            right(root.left,list);
        }
        else{
            right(root.right,list);
        }
    }
}
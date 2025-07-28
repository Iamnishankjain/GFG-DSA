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
}*/
class Solution {
    // Function to return list containing elements of left view of binary tree.
    ArrayList<Integer> leftView(Node root) {
        ArrayList<Integer> list=new ArrayList<>();
        get(root,list,0);
        return list;
    }
    
    void get(Node root,ArrayList<Integer> list,int l){
        if(root==null) return;
        if(list.size()==l) list.add(root.data);
        get(root.left,list,l+1);
        get(root.right,list,l+1);
    }
}
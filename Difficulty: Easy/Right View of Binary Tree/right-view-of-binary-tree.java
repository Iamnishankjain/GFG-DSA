/*Complete The Function Provided
Given Below is The Node Of Tree
class Node
{
    int data;
    Node left, right;
    public Node(int data)
    {
        this.data = data;
         left = right = null;
    }
}*/

class Solution {
    // Function to return list containing elements of right view of binary tree.
    ArrayList<Integer> rightView(Node root) {
        ArrayList<Integer> list=new ArrayList<>();
        get(root,list,0);
        return list;
    }
    
    void get(Node root,ArrayList<Integer> list,int l){
        if(root==null) return;
        if(list.size()==l) list.add(root.data);
        get(root.right,list,l+1);
        get(root.left,list,l+1);
    }
}
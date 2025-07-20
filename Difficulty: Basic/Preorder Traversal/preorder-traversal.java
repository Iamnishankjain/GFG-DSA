class Solution {
    // Function to return a list containing the preorder traversal of the tree.
    static ArrayList<Integer> preorder(Node root) {
        // write code here
        ArrayList<Integer> list=new ArrayList<>();
        pre(root,list);
        return list;
    }
    
    static void pre(Node root,ArrayList<Integer> list){
        if(root == null) return;
        list.add(root.data);
        pre(root.left,list);
        pre(root.right,list);
    }
}
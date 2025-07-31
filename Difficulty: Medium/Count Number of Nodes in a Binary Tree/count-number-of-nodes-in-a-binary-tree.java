// User function Template for Java

class Solution {

    public int countNodes(Node root) {
        // Code here
        if(root==null) return 0;
        int lh=leftHeight(root);
        int rh=rightHeight(root);

        if(lh==rh) return (2<<lh)-1;
        return 1+countNodes(root.left)+countNodes(root.right);
    }
    public int leftHeight(Node node){
        int h=0;
        while(node.left!=null){
            h++;
            node=node.left;
        }
        return h;
    }
    public int rightHeight(Node node){
        int h=0;
        while(node.right!=null){
            h++;
            node=node.right;
        }
        return h;
    }
}
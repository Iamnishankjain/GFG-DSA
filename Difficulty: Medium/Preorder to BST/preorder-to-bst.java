// User function Template for Java

/*
class Node {
    int data;
    Node left, right;

    Node(int d) {
        data = d;
        left = right = null;
    }
}
*/

class Solution {
    // Function that constructs BST from its preorder traversal.
    public Node Bst(int pre[], int size) {
        return build(pre,size,Long.MAX_VALUE,new int[]{0});
        
    }
    public Node build(int pre[],int n,long ub,int i[]){
        if(i[0]==n || pre[i[0]]>ub) return null;
        Node root=new Node(pre[i[0]++]);
        root.left=build(pre,n,root.data,i);
        root.right=build(pre,n,ub,i);
        return root;
    }
}
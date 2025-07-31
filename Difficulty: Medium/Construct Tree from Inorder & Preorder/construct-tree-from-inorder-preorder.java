/*
class Node {
    int data;
    Node left, right;

    Node(int key) {
        data = key;
        left = right = null;
    }
}
*/

class Solution {
    public static Node buildTree(int inorder[], int preorder[]) {
        // code here
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }

        Node root=build(preorder,0,preorder.length-1,inorder,0,inorder.length-1,map);
        return root;
    }

    public static Node build(int[] preorder,int preSt,int preEnd, int[] inorder,int inSt,int inEnd,HashMap<Integer,Integer> map){
        if(preSt>preEnd || inSt>inEnd) return null;

        Node root=new Node(preorder[preSt]);
        int indRoot=map.get(root.data);
        int indLeft=indRoot-inSt;
        root.left=build(preorder,preSt+1,indLeft+preSt,inorder,inSt,indRoot-1,map);
        root.right=build(preorder,preSt+indLeft+1,preEnd,inorder,indRoot+1,inEnd,map);
        return root;
    }
}
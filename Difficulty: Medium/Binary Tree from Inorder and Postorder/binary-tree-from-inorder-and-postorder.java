class Solution {
    Node buildTree(int[] inorder, int[] postorder) {
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }

        Node root=build(postorder,postorder.length-1,0,inorder,0,inorder.length-1,map);
        return root;
    }

    public Node build(int[] postorder,int postSt,int postEnd, int[] inorder,int inSt,int inEnd,HashMap<Integer,Integer> map){
        if(postSt<postEnd || inSt>inEnd) return null;

        Node root=new Node(postorder[postSt]);
        int indRoot=map.get(root.data);
        int numRight=inEnd-indRoot;
        root.right=build(postorder,postSt-1,postEnd-numRight,inorder,indRoot+1,inEnd,map);
        root.left=build(postorder,postSt-numRight-1,postEnd,inorder,inSt,indRoot-1,map);
        return root;
    }
}
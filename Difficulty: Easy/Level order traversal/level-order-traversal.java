/*
class Node {
    int data;
    Node left, right;

    Node(int item) {
        data = item;
        left = right = null;
    }
}
*/
class Solution {
    public ArrayList<ArrayList<Integer>> levelOrder(Node root) {
        // Your code here
        ArrayList<ArrayList<Integer>> res=new ArrayList<>();
        if(root==null) return res;
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        
        while(!q.isEmpty()){
            int levelnum=q.size();
            ArrayList<Integer> list=new ArrayList<>();
            
            for(int i=0;i<levelnum;i++){
                Node front=q.remove();
                list.add(front.data);
                if(front.left!=null) q.add(front.left);
                if(front.right!=null) q.add(front.right);
            }
            res.add(list);
        }
        return res;
    }
}
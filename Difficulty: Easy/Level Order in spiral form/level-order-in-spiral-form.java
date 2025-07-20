/*
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
*/
class Solution {
    public ArrayList<Integer> findSpiral(Node root) {
        // code here
        ArrayList<Integer> res=new ArrayList<>();
        if(root==null) return res;
        int flag=0;
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int level=q.size();
            ArrayList<Integer> list=new ArrayList<>();

            for(int i=0;i<level;i++){
                Node front=q.remove();
                if(flag==0){
                    list.add(0,front.data);
                }
                else{
                    list.add(front.data);
                }

                if(front.left!=null) q.add(front.left);
                if(front.right!=null) q.add(front.right);
            }
            flag= flag==0 ? 1: 0;
            res.addAll(list);
        }
        return res;
    }
}
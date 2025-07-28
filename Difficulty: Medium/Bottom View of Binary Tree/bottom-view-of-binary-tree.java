/*
class Node
{
    int data; //data of the node
    int hd; //horizontal distance of the node
    Node left, right; //left and right references

    // Constructor of tree node
    public Node(int key)
    {
        data = key;
        hd = Integer.MAX_VALUE;
        left = right = null;
    }
}
*/
class Pair{
    Node node;
    int x;
    Pair(Node node,int x){
        this.node=node;
        this.x=x;
    }
}
class Solution {
    public ArrayList<Integer> bottomView(Node root) {
        // Code here
        ArrayList<Integer> list=new ArrayList<>();
        if(root==null) return list;
        TreeMap<Integer,Integer> map=new TreeMap<>();
        Queue<Pair> q=new LinkedList<>();
        q.offer(new Pair(root,0));
        while(!q.isEmpty()){
            Pair curr=q.poll();
            int x=curr.x;
            Node currNode=curr.node;
            map.put(x,currNode.data);
            if(currNode.left!=null) q.offer(new Pair(currNode.left,x-1));
            if(currNode.right!=null) q.offer(new Pair(currNode.right,x+1));
        }
        
        for(Map.Entry<Integer,Integer> key: map.entrySet()){
            list.add(key.getValue());
        }
        return list;
    }
}
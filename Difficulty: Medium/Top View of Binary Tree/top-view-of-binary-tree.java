/*
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
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
    // Function to return a list of nodes visible from the top view
    // from left to right in Binary Tree.
    static ArrayList<Integer> topView(Node root) {
        // code here
        ArrayList<Integer> list=new ArrayList<>();
        if(root==null) return list;
        TreeMap<Integer,Integer> map=new TreeMap<>();
        Queue<Pair> q=new LinkedList<>();
        q.offer(new Pair(root,0));
        while(!q.isEmpty()){
            Pair curr=q.poll();
            int x=curr.x;
            Node currNode=curr.node;
            if(!map.containsKey(x)){
                map.put(x,currNode.data);
            }
            if(currNode.left!=null) q.offer(new Pair(currNode.left,x-1));
            if(currNode.right!=null) q.offer(new Pair(currNode.right,x+1));
        }
        
        for(Map.Entry<Integer,Integer> key: map.entrySet()){
            list.add(key.getValue());
        }
        return list;
    }
}
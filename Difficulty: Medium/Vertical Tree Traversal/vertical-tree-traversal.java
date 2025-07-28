/*
class Node
{
    int data;
    Node left, right;

    public Node(int d)
    {
        data = d;
        left = right = null;
    }
}
*/
class Pair{
    Node node;
    int x,level;
    Pair(Node node,int x,int level){
        this.node=node;
        this.x=x;
        this.level=level;
    }
}
class Solution {
    static ArrayList<ArrayList<Integer>> verticalOrder(Node root) {
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        if(root==null) return ans;
         TreeMap<Integer,TreeMap<Integer,ArrayList<Integer>>> map=new TreeMap<>();
        Queue<Pair> q=new LinkedList<>();
        q.offer(new Pair(root,0,0));
        while(!q.isEmpty()){
            Pair curr=q.poll();
            Node currNode=curr.node;
            int v=curr.x;
            int l=curr.level;

            if(!map.containsKey(v)){
                map.put(v,new TreeMap<>());
            }
            if(!map.get(v).containsKey(l)){
                map.get(v).put(l,new ArrayList<>());
            }
            map.get(v).get(l).add(currNode.data);
            if(currNode.left!=null) q.offer(new Pair(currNode.left,v-1,l+1));
            if(currNode.right!=null) q.offer(new Pair(currNode.right,v+1,l+1));
        }


         for(Map.Entry<Integer,TreeMap<Integer,ArrayList<Integer>>> outerEntry: map.entrySet()){
            ArrayList<Integer> col=new ArrayList<>();
            TreeMap<Integer,ArrayList<Integer>> innerMap=outerEntry.getValue();
            for(Map.Entry<Integer,ArrayList<Integer>> innerEntry: innerMap.entrySet()){
                ArrayList<Integer> pq=innerEntry.getValue();
                while(!pq.isEmpty()) col.add(pq.remove(0));
            }
            ans.add(col);
        }
        return ans;
    }
}
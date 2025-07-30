// class Node
// {
//     int data;
//     Node left, right;
// }

class Solution {
    public ArrayList<Integer> KDistanceNodes(Node root, int tar, int k) {
        ArrayList<Integer> list=new ArrayList<>();
        if(root==null) return list;
        Map<Node,Node> parent=new HashMap<>();
        getParent(root,parent);
        List<Node> visited=new ArrayList<>();
        Queue<Node> q=new LinkedList<>();
        Node target=getTarget(root,tar);
        visited.add(target);
        q.offer(target);
        int dist=0;
        while(!q.isEmpty()){
            int size=q.size();
            if(dist==k) break;
            dist++;
            for(int i=0;i<size;i++){
                Node curr=q.poll();
                if(curr.left!=null && !visited.contains(curr.left)){
                    visited.add(curr.left);
                    q.offer(curr.left);
                }
                if(curr.right!=null && !visited.contains(curr.right)){
                    visited.add(curr.right);
                    q.offer(curr.right);
                }
                if(parent.get(curr)!=null && !visited.contains(parent.get(curr))){
                    visited.add(parent.get(curr));
                    q.offer(parent.get(curr));
                }
            }
        }
        while(!q.isEmpty()){
            list.add(q.poll().data);
        }
        Collections.sort(list);
        return list;
    }

    public void getParent(Node root,Map<Node,Node> parent){
        if(root==null) return;
        Queue<Node> q=new LinkedList<>();
        q.offer(root);
        parent.put(root,null);
        while(!q.isEmpty()){
            Node curr=q.poll();
            if(curr.left!=null){
                parent.put(curr.left,curr);
                q.offer(curr.left);
            }
            if(curr.right!=null){
                parent.put(curr.right,curr);
                q.offer(curr.right);
            }
        }
    }
    public Node getTarget(Node root,int tar){
        if(root==null){
            return null;
        }
        if(root.data==tar){
            return root;
        }
        Node left=getTarget(root.left,tar);
        if(left!=null) return left;    
        Node right=getTarget(root.right,tar);
        return right;
    }
};